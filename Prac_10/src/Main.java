import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Student[] setArray(Student[] students) {
        Random random = new Random();
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (int i = 0; i < students.length; i++)
            students[i] = new Student(
                    alphabet[random.nextInt(100) % 26],
                    alphabet[random.nextInt(100) % 26],
                    alphabet[random.nextInt(100) % 26],
                    alphabet[random.nextInt(100) % 26],
                    random.nextInt(10),
                    random.nextInt(10),
                    random.nextInt(10)
            );
        return students;
    }


    public static void printStudentsArray(Student[] students) {
        for (Student i : students)
            System.out.println(i);
    }

    public static Student[][] parseForMergeSort(Student[] students) {
        Student[][] parsedArrays = new Student[2][];
        int len = students.length, mod = len % 2;
        Student[] students_1 = new Student[len / 2];
        Student[] students_2 = new Student[len / 2 + mod];
        for (int i = 0; i < len / 2; i++)
            students_1[i] = students[i];
        for (int i = 0; i < len / 2 + mod; i++)
            students_2[i] = students[len / 2 + i];


        parsedArrays[0] = students_1;
        parsedArrays[1] = students_2;
        return parsedArrays;
    }

    public static Student[] sortAndContaminate(Student[] students_1, Student[] students_2) {
        if (students_1.length > 1) {
            Student[][] parsed = parseForMergeSort(students_1);
            students_1 = sortAndContaminate(parsed[0], parsed[1]);
        }
        if (students_2.length > 1) {
            Student[][] parsed = parseForMergeSort(students_2);
            students_2 = sortAndContaminate(parsed[0], parsed[1]);
        }

        int len_1 = students_1.length, len_2 = students_2.length, i = 0, j = 0, k = 0;
        Student[] studentsSorted = new Student[len_1 + len_2];
        StudentComparatorGPA studentComparator = new StudentComparatorGPA();

        while ((i < len_1) && (j < len_2)) {
            if (studentComparator.compare(students_1[i], students_2[j]) < 0){
                studentsSorted[k] = students_1[i];
                i++;
            }
            else {
                studentsSorted[k] = students_2[j];
                j++;
            }
            k++;
        }
        while (i < len_1) {
            studentsSorted[k] = students_1[i];
            i++;
            k++;
        }
        while (j < len_2) {
            studentsSorted[k] = students_2[j];
            j++;
            k++;
        }

        return studentsSorted;
    }

    public static Student[] sortingStudentsByGPA_mergeSort(Student[] students) {
        if (students.length < 2) return students;
        Student[][] parsedStudents = parseForMergeSort(students);
        Student[] students_1 = sortingStudentsByGPA_mergeSort(parsedStudents[0]),
                students_2 = sortingStudentsByGPA_mergeSort(parsedStudents[1]),
                studentsSorted = new Student[students.length];
        int len_1 = students_1.length, len_2 = students_2.length, i = 0, j = 0, k = 0;
        StudentComparatorGPA comparator = new StudentComparatorGPA();
        while (i < len_1 && j < len_2) {
            if (comparator.compare(students_1[i], students_2[j]) < 0) {
                studentsSorted[k] = students_1[i];
                i++;
            } else {
                studentsSorted[k] = students_2[j];
                j++;
            }
            k++;
        }
        while (i < len_1) {
            studentsSorted[k] = students_1[i];
            i++;
            k++;
        }
        while (j < len_2) {
            studentsSorted[k] = students_2[j];
            j++;
            k++;
        }

        return studentsSorted;
    }

    private static int partition(Student[] arr, int low, int high) {
        Student pivot = arr[high];
        StudentComparatorGPA comparator = new StudentComparatorGPA();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comparator.compare(arr[j], pivot) < 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static Student[] sortingStudentsByGPA_quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            sortingStudentsByGPA_quickSort(students, low, pi - 1);
            sortingStudentsByGPA_quickSort(students, pi + 1, high);
        }
        return students;
    }




    public static void main(String[] args) {
        Student[] students = setArray(new Student[6]);
        System.out.println("Array after sorting:\n");
        printStudentsArray(students);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input task number: ");
        switch (scanner.nextLine()){
            case "1":
                System.out.println("Merge sort:\n");
                printStudentsArray(sortingStudentsByGPA_mergeSort(students));
                break;
            case "2":
                System.out.println("Sort and union:\n");
                Student[][] parsed = parseForMergeSort(students);
                printStudentsArray(sortAndContaminate(parsed[0],parsed[1]));
                break;
            case "3":
                System.out.println("Quick sort:\n");
                printStudentsArray(sortingStudentsByGPA_quickSort(students, 0, students.length - 1));
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }

    }







}