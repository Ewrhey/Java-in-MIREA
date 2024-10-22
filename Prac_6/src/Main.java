import java.util.Scanner;

public class Main {

    private static void task_1_1() {
        Scanner scanner = new Scanner(System.in);
        MovablePoint movablePoint = new MovablePoint(0, 0, 10, 10);
        System.out.println("Point:\nInput x:");
        movablePoint.setX(scanner.nextInt());
        System.out.println("Input y:");
        movablePoint.setY(scanner.nextInt());
        System.out.println("Input xSpeed:");
        movablePoint.setxSpeed(scanner.nextInt());
        System.out.println("Input ySpeed:");
        movablePoint.setySpeed(scanner.nextInt());

        int command = 1;
        while (command > 0) {
            System.out.println("\nPoint:\nInput command:\n1 - MoveUp\n2 - MoveDown\n3 - MoveLeft\n" +
                    "4 - MoveRight\n5 - print info about shape\n0 - exit");
            command = scanner.nextInt();
            switch (command) {
                case 0:
                    break;
                case 1:
                    movablePoint.moveUp();
                    break;
                case 2:
                    movablePoint.moveDown();
                    break;
                case 3:
                    movablePoint.moveLeft();
                    break;
                case 4:
                    movablePoint.moveRight();
                    break;
                case 5:
                    System.out.println(movablePoint.toString());
            }
        }
    }

    private static void task_1_2() {
        Scanner scanner = new Scanner(System.in);
        MovableCircle movableCircle = new MovableCircle(0, 0, 0, 10, 10);
        System.out.println("Circle:\nInput x:");
        int x = scanner.nextInt();
        System.out.println("Input y:");
        int y = scanner.nextInt();
        System.out.println("Input xSpeed:");
        int xSpeed = scanner.nextInt();
        System.out.println("Input ySpeed:");
        int ySpeed = scanner.nextInt();
        movableCircle.setCenter(x, y, xSpeed, ySpeed);
        System.out.println("Input radius:");
        movableCircle.setRadius(scanner.nextInt());

        int command = 1;
        while (command > 0) {
            System.out.println("Point:\n\nInput command:\n1 - MoveUp\n2 - MoveDown\n3 - MoveLeft\n" +
                    "4 - MoveRight\n5 - print info about shape\n0 - exit");
            command = scanner.nextInt();
            switch (command) {
                case 0:
                    break;
                case 1:
                    movableCircle.moveUp();
                    break;
                case 2:
                    movableCircle.moveDown();
                    break;
                case 3:
                    movableCircle.moveLeft();
                    break;
                case 4:
                    movableCircle.moveRight();
                    break;
                case 5:
                    System.out.println(movableCircle.toString());
            }
        }
    }

    private static void task_6_7_8_9() {
        Printable[] printableArray = new Printable[6];
        printableArray[0] = new Book("1984");
        printableArray[1] = new Shop("TestShop 1");
        printableArray[2] = new Book("451 F");
        printableArray[3] = new Shop("TestShop 2");
        printableArray[4] = new Shop("TestShop 3");
        printableArray[5] = new Shop("testShop 4");
        for (Printable i : printableArray) {
            i.print();
        }
    }
    private static void task_11(){
        Convertible convertibleF = new FahrenheitConvertible();
        Convertible convertibleK = new KelvinConvertible();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input C, F, K; C - number degrees Celsius, F - degrees Fahrenheit, K - degrees Kelvin");
        float c = scanner.nextFloat();
        float f = scanner.nextFloat();
        float k = scanner.nextFloat();
        System.out.println("C in degrees Fahrenheit: " + convertibleF.convertFromC(c)
                + "\nC in degrees Kelvin: " + convertibleK.convertFromC(c) +
                "\n\nF in degrees Celsius: " + convertibleF.convertToC(f) +
                "\n\nK in degrees Celsius: " + convertibleK.convertToC(k));
     }

    public static void main(String[] args) {
//        task_1_1();
//        task_1_2();
//        task_6_7_8_9();
//        task_11();

    }
}