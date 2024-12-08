import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task_1();
        task_2();


    }

    public static void task_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input INN (10 or 12 numbers):");
        try {
            checkINN(scanner.next());
            System.out.println("Correct INN");
        } catch (INNIncorrectNameException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int stringIntByIndex(String s, int index) {
        return Integer.parseInt(String.valueOf(s.charAt(index)));
    }

    public static void checkINN(String inn) throws INNIncorrectNameException {
        switch (inn.length()) {
            case 10:
                int controlNumber = (stringIntByIndex(inn, 0) * 2 + stringIntByIndex(inn, 1) * 4 +
                        stringIntByIndex(inn, 2) * 10 + stringIntByIndex(inn, 3) * 3 +
                        stringIntByIndex(inn, 4) * 5 + stringIntByIndex(inn, 5) * 9 +
                        stringIntByIndex(inn, 6) * 4 + stringIntByIndex(inn, 7) * 6 +
                        stringIntByIndex(inn, 8) * 8) % 11;
                if (stringIntByIndex(inn, 9) != controlNumber % 10)
                    throw new INNIncorrectNameException("Incorrect value of INN");
                break;
            case 12:
                int controlNumber1 = (stringIntByIndex(inn, 0) * 7 + stringIntByIndex(inn, 1) * 2 +
                        stringIntByIndex(inn, 2) * 4 + stringIntByIndex(inn, 3) * 10 +
                        stringIntByIndex(inn, 4) * 3 + stringIntByIndex(inn, 5) * 5 +
                        stringIntByIndex(inn, 6) * 9 + stringIntByIndex(inn, 7) * 4 +
                        stringIntByIndex(inn, 8) * 6 + stringIntByIndex(inn, 9) * 8) % 11;
                int controlNumber2 = (stringIntByIndex(inn, 0) * 3 + stringIntByIndex(inn, 1) * 7 +
                        stringIntByIndex(inn, 2) * 2 + stringIntByIndex(inn, 3) * 4 +
                        stringIntByIndex(inn, 4) * 10 + stringIntByIndex(inn, 5) * 3 +
                        stringIntByIndex(inn, 6) * 5 + stringIntByIndex(inn, 7) * 9 +
                        stringIntByIndex(inn, 8) * 4 + stringIntByIndex(inn, 9) * 6 +
                        stringIntByIndex(inn, 10) * 8) % 11;
                if (controlNumber1 % 10 != stringIntByIndex(inn, 10) ||
                        controlNumber2 % 10 != stringIntByIndex(inn, 11))
                    throw new INNIncorrectNameException("Incorrect value of INN");
                break;
            default:
                throw new INNIncorrectNameException("Incorrect len of INN: " + inn.length());
        }


    }

    public static void task_2() {
        StudentArrayList students = setArray(new StudentArrayList(), 6);
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (true){
            System.out.println("Menu: \n1 - find by name\n2 - sort by gpa\nsomething else - exit" );
            switch (scanner.next()){
                case "1":
                    System.out.print("Input name: ");
                    String fullName = scanner.next();
                    try {
                        Student student = StudentArrayList.findStudentByFullName(fullName);
                        System.out.println("Found student: " + student);
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    selectionSortByGPA(students.getStudents());
                    printStudentsArray(students.getStudents());
                    break;
                default:
                    flag = false;
            }

        }

    }

    public static StudentArrayList setArray(StudentArrayList students, int len) {
        Random random = new Random();
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < len; i++)
            students.addStudent(new Student(
                    alphabet[random.nextInt(100) % 26],
                    random.nextInt(10)
            ));
        return students;
    }

    public static void printStudentsArray(List<Student> students) {
        for (Student i : students)
            System.out.println(i);
    }
    public static void selectionSortByGPA(List<Student> students) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students.get(j).getGPA() < students.get(minIndex).getGPA()) {
                    minIndex = j;
                }
            }

            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }

}