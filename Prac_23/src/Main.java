import java.util.Scanner;

public class Main {
    public static void task_1(){
        ArrayQueue arrayQueue = new ArrayQueue();
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();

        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);

        arrayQueueADT.enqueue(arrayQueueADT, 3);
        arrayQueueADT.enqueue(arrayQueueADT, 4);
        arrayQueueADT.enqueue(arrayQueueADT,5);

        arrayQueueModule.enqueue(6);
        arrayQueueModule.enqueue(7);
        arrayQueueModule.enqueue(8);

        System.out.println(arrayQueue + "\n" + arrayQueueADT + "\n" + arrayQueueModule);

    }

    public static void task_2(){
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(9);
        linkedQueue.enqueue(10);
        linkedQueue.enqueue(11);
        System.out.println(linkedQueue);
    }

    public static void task_3(String console){
        // (x * x) - (2 * x) + 1
        ExpressionsAll.Expression expression = new ExpressionsAll.Add(
                new ExpressionsAll.Subtract(
                        new ExpressionsAll.Multiply(new ExpressionsAll.Variable("x"), new ExpressionsAll.Variable("x")),
                        new ExpressionsAll.Multiply(new ExpressionsAll.Const(2), new ExpressionsAll.Variable("x"))
                ),
                new ExpressionsAll.Const(1)
        );

        double result = expression.evaluate(Integer.parseInt(console), 1, 1);
        System.out.println("Result: " + result);

    }

    public static void task_4(){
        double x = 0, y = 0, z = 0;
        String expr = "x + y + z";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x:");
        x = scanner.nextDouble();
        System.out.println("Input y:");
        y = scanner.nextDouble();
        System.out.println("Input z:");
        z = scanner.nextDouble();
        System.out.println("Input expression:");
        scanner.nextLine();
        expr = scanner.nextLine();
        ExpressionsAll.ExpressionParser parser = new ExpressionsAll.ExpressionParser();
        try {
            ExpressionsAll.Expression expression = parser.parse(expr);
            System.out.println(expr + " result with x= " + x + ", y= " + y + ", z= " + z + ": "
                               + expression.evaluate(x, y, z));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



    public static void main(String[] args) {
        task_1();
        task_2();
        task_3(args[0]);
        task_4();

    }
}