import java.util.Scanner;

public class Main {
    private static void task_1() {
        Shape shape = new Shape("Abstract shape", 10, 7);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(10);
        System.out.println(shape.toString() + "\n\n" + circle.toString() + "\n\n" + rectangle.toString() +
                "\n\n" + square.toString());
    }

    private static void task_7() {
        Learner[] learnerArray = new Learner[5];
        learnerArray[0] = new Schoolkid("A", "B", 10,
                "school 1158", 3, 5);
        learnerArray[1] = new Student("AA", "BB", 20, "MIREA", 2, 0);
        learnerArray[2] = new Student("AAA", "BBB", 22, "MPGU", 4, 15300);
        learnerArray[3] = new Schoolkid("AAAA", "BBBB", 17,
                "school 1580", 10, 3);
        learnerArray[4] = new Schoolkid("AAAAA", "BBBBB", 15,
                "school 549", 9, 4);
        System.out.println("Schoolkids:");
        for (Learner i : learnerArray) {
            if (i instanceof Schoolkid)
                System.out.println(i.toString());
        }
        System.out.println("\nStudents:");
        for (Learner i : learnerArray) {
            if (i instanceof Student)
                System.out.println(i.toString());
        }

    }

    private static void task_10() {
        Car car = new Car(60);
        Plane plane = new Plane(926);
        Ship ship = new Ship(45);
        Train train = new Train(80);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in km: ");
        int distance = scanner.nextInt();
        System.out.println("Price and time of travel:\n\nCar: "
                + car.getJourneyPrice(distance) + " RUB " + car.getJourneyTime(distance) + " hour\n" +
                "Plane: " + plane.getJourneyPrice(distance) + " RUB " + plane.getJourneyTime(distance) + " hour\n" +
                "Ship: " + ship.getJourneyPrice(distance) + " RUB " + ship.getJourneyTime(distance) + " hour\n" +
                "Train: " + train.getJourneyPrice(distance) + " RUB " + train.getJourneyTime(distance) + " hour");
    }

    public static void main(String[] args) {
        //task_1();
        //task_7();
        //task_10();

    }
}