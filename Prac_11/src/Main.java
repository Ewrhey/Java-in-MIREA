import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void task_1() {
        String surname = "Lyubanov";

        Date dateBegin = new Date(2024 - 1900, Calendar.SEPTEMBER, 1, 1, 1);

        long currentTimeMillis = System.currentTimeMillis();
        Date dateEnd = new Date(currentTimeMillis);

        SimpleDateFormat dateFormat = new SimpleDateFormat();

        System.out.println("Surname programmer: " + surname);
        System.out.println("Date and time begin of task: " + dateFormat.format(dateBegin));
        System.out.println("Date and time end of task: " + dateFormat.format(dateEnd));
    }

    public static void task_2() {
        LocalDate currentDate = LocalDate.now();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input date in format YYYY-MM-DD: ");
        String userInput = scanner.nextLine();
        String[] parseInput = userInput.split("-");
        if (!checkDate(parseInput[0], parseInput[1], parseInput[2], "1", "1")
                || parseInput[0].length() > 4 || parseInput[0].isEmpty()
                || parseInput[1].length() > 2 || parseInput[1].isEmpty()
                || parseInput[2].length() > 2 || parseInput[2].isEmpty()
                || parseInput.length > 3 || parseInput.length < 1) {
            System.out.println("Incorrect output");
            return;
        }
        while (parseInput[0].length() < 4)
            parseInput[0] = "0" + parseInput[0];
        if (parseInput[1].length() == 1)
            parseInput[1] = "0" + parseInput[1];
        if (parseInput[2].length() == 1)
            parseInput[2] = "0" + parseInput[2];


        LocalDate userDate = LocalDate.parse(String.join("-", parseInput[0], parseInput[1], parseInput[2]));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.println("Current date: " + currentDate.format(formatter));
        System.out.println("Inputted date: " + userDate.format(formatter));

        if (userDate.isEqual(currentDate)) {
            System.out.println("Dates are equal");
        } else if (userDate.isBefore(currentDate)) {
            System.out.println("Inputted date before current date");
        } else {
            System.out.println("Inputted date after current date");
        }
    }

    public static void task_3() {
        Student student = new Student("A", "B", "C", "D", 1, 2, 3, LocalDate.of(2024, 11, 18));
        System.out.println(student);
    }

    public static boolean isNumb(String string) {
        final String numbers = "0123456789";
        for (int i = 0; i < string.length(); i++) {
            if (numbers.indexOf(string.charAt(i)) == -1)
                return false;
        }
        return true;
    }

    public static boolean checkDate(String year, String month, String day, String hours, String minutes) {
        if (!(isNumb(year) && isNumb(month) && isNumb(day) && isNumb(hours) && isNumb(minutes)))
            return false;
        final int[] dateInt = {Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day),
                Integer.parseInt(hours), Integer.parseInt(minutes)};
        if (dateInt[1] > 12 || dateInt[1] < 1 || dateInt[3] > 23 || dateInt[3] < 1 || dateInt[4] > 59 || dateInt[4] < 1)
            return false;
        int b = 28;
        if (dateInt[0] % 400 == 0 || (dateInt[0] % 4 == 0 && dateInt[0] % 100 != 0))
            b = 29;
        final int[] dayInMonth = {31, b, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (dateInt[2] > 31 || dateInt[2] < 1 || dayInMonth[dateInt[1] - 1] < dateInt[2])
            return false;
        return true;
    }

    public static void task_4() {
        Scanner scanner = new Scanner(System.in);
        String year, month, day, hours, minutes;
        System.out.print("Input year: ");
        year = scanner.next();
        System.out.print("Input month: ");
        month = scanner.next();
        System.out.print("Input day: ");
        day = scanner.next();
        System.out.print("Input hour: ");
        hours = scanner.next();
        System.out.print("Input minute: ");
        minutes = scanner.next();
        if (checkDate(year, month, day, hours, minutes)) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1,
                    Integer.parseInt(day), Integer.parseInt(hours), Integer.parseInt(minutes));

            System.out.println("Calendar: " + calendar.getTime());
            scanner.close();
        } else
            System.out.println("Incorrect output");
    }

    public static void task_5() {
        final int N = 10000000;
        int index, target;

        // Filling
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            arrayList.add(random.nextInt(N));
        }

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            linkedList.add(random.nextInt(N));
        }

        // Adding in ArrayList
        long startTime = System.currentTimeMillis();
        arrayList.add(random.nextInt(N));
        long endTime = System.currentTimeMillis();
        long arrayListAdditionTime = endTime - startTime;
        System.out.println("\nTime of Adding в ArrayList: " + arrayListAdditionTime + " millisecond");

        // Adding in LinkedList
        startTime = System.currentTimeMillis();
        linkedList.add(random.nextInt(N));
        endTime = System.currentTimeMillis();
        long linkedListAdditionTime = endTime - startTime;
        System.out.println("Time of Adding в LinkedList: " + linkedListAdditionTime + " millisecond");

        // Insertion in ArrayList
        startTime = System.currentTimeMillis();
        index = random.nextInt(N);
        arrayList.add(index, random.nextInt(N));
        endTime = System.currentTimeMillis();
        long arrayListInsertionTime = endTime - startTime;
        System.out.println("\nTime of Insertion in ArrayList: " + arrayListInsertionTime + " millisecond");

        // Insertion in LinkedList
        startTime = System.currentTimeMillis();
        index = random.nextInt(N);
        linkedList.add(index, random.nextInt(N));
        endTime = System.currentTimeMillis();
        long linkedListInsertionTime = endTime - startTime;
        System.out.println("Time of Insertion in LinkedList: " + linkedListInsertionTime + " millisecond");

        // Deletion from ArrayList
        startTime = System.currentTimeMillis();
        index = random.nextInt(N);
        arrayList.remove(index);
        endTime = System.currentTimeMillis();
        long arrayListDeletionTime = endTime - startTime;
        System.out.println("\nTime of Deletion from ArrayList: " + arrayListDeletionTime + " millisecond");

        // Deletion from LinkedList
        startTime = System.currentTimeMillis();
        index = random.nextInt(N);
        linkedList.remove(index);
        endTime = System.currentTimeMillis();
        long linkedListDeletionTime = endTime - startTime;
        System.out.println("Time of Deletion from LinkedList: " + linkedListDeletionTime + " millisecond");

        // Pattern searching operations in ArrayList
        startTime = System.currentTimeMillis();
        target = random.nextInt(N);
        arrayList.contains(target);
        endTime = System.currentTimeMillis();
        long arrayListSearchTime = endTime - startTime;
        System.out.println("\nTime Pattern searching operations in ArrayList: " + arrayListSearchTime + " millisecond");

        // Pattern searching operations in LinkedList
        startTime = System.currentTimeMillis();
        target = random.nextInt(N);
        linkedList.contains(target);
        endTime = System.currentTimeMillis();
        long linkedListSearchTime = endTime - startTime;
        System.out.println("Time Pattern searching operations in LinkedList: " + linkedListSearchTime + " millisecond");

    }

    public static void main(String[] args) {
//        task_1();
//        task_2();
//        task_3();
//        task_4();
//        task_5();
    }
}