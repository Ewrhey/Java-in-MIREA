import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    private static void task_1_1(){
        Random rnd = new Random();
        float[] arr_1 = new float[10];
        for (int i = 0; i < arr_1.length; i ++)
            arr_1[i] = rnd.nextFloat();
        System.out.println("Array 1(with Random) before sort: ");
        for (float i : arr_1)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Array 1(with Random) after sort: ");
        Arrays.sort(arr_1);
        for (float i : arr_1)
            System.out.print(i + " ");
        System.out.println();

        float[] arr_2 = new float[10];
        for (int i = 0; i < arr_2.length; i ++)
            arr_2[i] = (float) Math.random();
        System.out.println("\nArray 2(with Math) before sort: ");
        for (float i : arr_2)
            System.out.print(i + " ");
        System.out.println();
        Arrays.sort(arr_2);
        System.out.println("Array 2(with Math) after sort: ");
        for (float i : arr_2)
            System.out.print(i + " ");
        System.out.println();
    }

    private static void task_1_4(){
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Input array size from 10 to 100: ");
        int len_1 = scn.nextInt();
        if (len_1 <= 100 && len_1 >= 10)
        {
            int len_2 = 0;
            int[] arr_1 = new int[len_1];
            for (int i = 0; i < len_1; i ++) {
                arr_1[i] = rnd.nextInt(0, len_1 + 1);
                if (arr_1[i] % 2 == 0)
                    len_2 ++;
            }
            int[] arr_2 = new int[len_2];
            int j = 0;
            for (int i = 0; i < len_1; i ++)
                if (arr_1[i] % 2 == 0){
                    arr_2[j] = arr_1[i];
                    j++;
                }

            System.out.println("Array 1: ");
            for (int i : arr_1)
                System.out.print(i + " ");
            System.out.println();

            System.out.println("Array 2: ");
            for (int i : arr_2)
                System.out.print(i + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        //task_1_1();
        //task_1_4();

        Converter cn = new Converter(1);


    }
}