import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        task_1();
//        task_2();
//        task_3();
    }
    public static void task_1(){
        TestClass<String, Animal, String> testClass =
                new TestClass<>("A",new Animal(), "test");
        testClass.checkType();
    }
    public static void task_2(){
        Integer[] integers = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < integers.length; i ++)
            integers[i] = random.nextInt(-10, 10);
        System.out.println("Array: ");
        for (Integer i : integers)
            System.out.print(i + " ");
        System.out.println();
        MinMax<Integer> integerMinMax = new MinMax<>(integers);
        System.out.println("Max element: " + integerMinMax.FindMax()
                + "\nMin element: " + integerMinMax.FindMin());
    }
    public static void task_3(){
        Random random = new Random();
        double num1 = random.nextDouble(1, 10);
        double num2 = random.nextInt(1, 10);
        System.out.println("Number 1: " + num1 + "\nNumber 2: " + num2);
        System.out.println("Sum: " + Calculator.sum(num1, num2) +
                "\nMultiply: " + Calculator.multiply(num1, num2) +
                "\nDivide: " + Calculator.div(num1, num2) +
                "\nSubtraction: " + Calculator.subtraction(num1, num2));
    }
}