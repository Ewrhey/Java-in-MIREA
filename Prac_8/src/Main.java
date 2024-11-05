import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static void task_1(int k, int n, int c){
        int cc = c;
        if (k != n + 1) {
        for (int i = 0; (i < k && cc < n); i++) {
            System.out.print(k + " ");
            cc += 1;
        }
            task_1(k + 1, n, cc);
        }
//        if (k != n + 1) {
//            for (int i = 0; i < k; i++) {
//                System.out.print(k + " ");
//            }
//            task_1(k + 1, n);
//        }
    }
    private static void task_2(int n, int i) {
        if (i <= n) {
            System.out.print(i + " ");
            task_2(n, i + 1);
        }
    }
    private static void task_15(int n) {
        if (n > 0) {
            System.out.print(n % 10 + " ");
            task_15(n / 10);
        }
    }

    private static void task_16(ArrayList<Integer> arrayList){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0){
            System.out.println(arrayList);
            int max = -1, count = 0;
            for (int i : arrayList)
                if (i > max)
                    max = i;
            for (int i : arrayList)
                if (i == max)
                    count += 1;
            System.out.println(max + ": " + count);
        }
        else {
            arrayList.add(n);
            task_16(arrayList);
        }

    }
    private static void task_17(ArrayList<Integer> arrayList){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0){
            System.out.println(arrayList);
            int max = -1;
            for (int i : arrayList)
                if (i > max)
                    max = i;
            System.out.println(max);
        }
        else {
            arrayList.add(n);
            task_17(arrayList);
        }
    }

    public static void main(String[] args) {
        //task_1(1, 10, 0);
        //task_2(10, 1);
        //task_15(12345);
        //task_16(new ArrayList<>());
        task_17(new ArrayList<>());
    }
}