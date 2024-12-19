import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
    }

    public static void task_1() {
        try {
            Integer[] numbers = {1, 2, 3, 4, 5};
            List<Integer> numberList = Solution.convertArrayToList(numbers);
            System.out.println("Task 1: List of numbers: " + numberList);
        } catch (Exception e) {
            System.out.println("Task 1 Error: " + e.getMessage());
        }
    }

    public static void task_2() {
        try {
            Solution.GenericArray<String> stringArray = new Solution.GenericArray<>(new String[]{"A", "B", "C", "D"});
            System.out.println("Task 2: Element at index 2: " + stringArray.getElement(2));
        } catch (Exception e) {
            System.out.println("Task 2 Error: " + e.getMessage());
        }
    }

    public static void task_3() {
        try {
            Solution.GenericArray<Integer> intArray = new Solution.GenericArray<>(new Integer[]{10, 20, 30});
            System.out.println("Task 3: Element at index 2: " + intArray.getElement(2));
        } catch (Exception e) {
            System.out.println("Task 3 Error: " + e.getMessage());
        }
    }

    public static void task_4() {
        try {
            List<String> files = Solution.getDirectoryContents(".");
            System.out.println("Task 4: First 5 files in the directory: " + files);
        } catch (Exception e) {
            System.out.println("Task 4 Error: " + e.getMessage());
        }
    }

    public static void task_5() {
        try {
            ArrayList<Integer> arrayList = Solution.newArrayList(1, 2, 3, 4);
            HashSet<String> hashSet = Solution.newHashSet("A", "B", "C");
            HashMap<String, Integer> hashMap = Solution.newHashMap(
                    new Solution.Pair<>("One", 1),
                    new Solution.Pair<>("Two", 2)
            );

            System.out.println("Task 5: ArrayList: " + arrayList);
            System.out.println("Task 5: HashSet: " + hashSet);
            System.out.println("Task 5: HashMap: " + hashMap);
        } catch (Exception e) {
            System.out.println("Task 5 Error: " + e.getMessage());
        }
    }
}
