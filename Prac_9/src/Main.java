//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex-1);
            quickSort(students, pivotIndex+1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low-1;

        for (int j=low; j<high; j++) {
            if (students.get(j).compareTo(pivot) <= 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i+1);
        students.set(i+1, students.get(high));
        students.set(high, temp);

        return i+1;
    }

    public static void insertionSortId(List<Student> students) {
        int n = students.size();
        for (int i = 1; i < n; i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getID() > key.getID()) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }
    }

//    public static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
//        List<Student> mergedList = new ArrayList<>();
//        int i = 0, j = 0;
//
//        while (i < list1.size() && j < list2.size()) {
//            if (list1.get(i).compareTo(list2.get(j)) >= 0) {
//                mergedList.add(list1.get(i));
//                i++;
//            } else {
//                mergedList.add(list2.get(j));
//                j++;
//            }
//        }
//
//        while (i < list1.size()) {
//            mergedList.add(list1.get(i));
//            i++;
//        }
//
//        while (j < list2.size()) {
//            mergedList.add(list2.get(j));
//            j++;
//        }
//
//        return mergedList;
//    }




    private static void task_1(){
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        Student student1 = new Student("AA", 12345, 3.4);
        Student student2 = new Student("BB", 56789, 3.5);
        Student student3 = new Student("CC", 23456, 3.2);
        Student student4 = new Student("DD", 98765, 2.9);
        Student student5 = new Student("EE", 95456, 4.0);
        Student student6 = new Student("FF", 21312, 2.0);

        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list2.add(student4);
        list2.add(student5);
        list2.add(student6);

        insertionSortId(list1);

        System.out.println("\nInsert sort by ID:\n");
        for (Student student : list1) {
            System.out.println(student);
        }

    }
    private static void task_2(){
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        Student student1 = new Student("AA", 12345, 3.4);
        Student student2 = new Student("BB", 56789, 3.5);
        Student student3 = new Student("CC", 23456, 3.2);
        Student student4 = new Student("DD", 98765, 2.9);
        Student student5 = new Student("EE", 95456, 4.0);
        Student student6 = new Student("FF", 21312, 2.0);

        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list2.add(student4);
        list2.add(student5);
        list2.add(student6);

        quickSort(list2, 0, list2.size()-1);
        System.out.println("\n\nQuick sort by GPA:\n");
        for (Student student : list2) {
            System.out.println(student);
        }
        System.out.println("\n");



    }

//    private static void task_3(){
//        List<Student> list1 = new ArrayList<>();
//        List<Student> list2 = new ArrayList<>();
//
//        Student student1 = new Student("AA", 12345, 3.4);
//        Student student2 = new Student("BB", 56789, 3.5);
//        Student student3 = new Student("CC", 23456, 3.2);
//        Student student4 = new Student("DD", 98765, 2.9);
//        Student student5 = new Student("EE", 95456, 4.0);
//        Student student6 = new Student("FF", 21312, 2.0);
//
//        list1.add(student1);
//        list1.add(student2);
//        list1.add(student3);
//        list2.add(student4);
//        list2.add(student5);
//        list2.add(student6);
//        List<Student> mergedList = mergeSortedLists(list1, list2);
//        System.out.println("\nSort and contaminate ");
//        for (Student i : mergedList)
//            System.out.println(i);
//    }

    public static void main(String[] args) {
        task_1();
        task_2();
        //task_3();
    }


}