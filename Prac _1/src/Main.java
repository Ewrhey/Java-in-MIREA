
import java.util.*;


public class Main {
    public static int max_int(int[] array) {
        int max_i = -2147483648;
        for (int i : array)
            if (i > max_i)
                max_i = i;
        return max_i;
    }

    public static void print_int_array(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }


    public static void task_1() {
        System.out.println("Task 1:\n");
        Random rnd = new Random();
        int[] array = new int[10];
        int sumArray = 0;
        for (int i = 0; i < array.length; i++)
            array[i] = rnd.nextInt(100);
        System.out.print("array: ");
        print_int_array(array);

        for (int i = 0; i < 4; i++)
            sumArray += array[i];

        float averageArray = (float) sumArray / array.length;
        System.out.println("Sum Array: " + sumArray + "\nAverage Array: " + averageArray + "\n");
    }

    public static void task_2() {
        System.out.println("Task 2:\n");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int j = 0;
        System.out.println("Input array:");
        while (j < array.length) {
            array[j] = scan.nextInt();
            j++;
        }
        System.out.print("array: ");
        print_int_array(array);
        System.out.println("max number: " + max_int(array));
    }
    
    public static void main(String[] args) {
        task_1();
        task_2();
    }
}
