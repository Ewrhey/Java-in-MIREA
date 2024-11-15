import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void task_1(){
        String surname = "Lyubanov";

        Date dateReceived = new Date();

        long currentTimeMillis = System.currentTimeMillis();
        long oneWeekInMillis = 6 * 24 * 60 * 60 * 1000L;
        Date dateDue = new Date(currentTimeMillis + oneWeekInMillis);

        SimpleDateFormat dateFormat = new SimpleDateFormat();

        System.out.println("Surname programmer: " + surname);
        System.out.println("Date and time begin of task: " + dateFormat.format(dateReceived));
        System.out.println("Date and time end of task: " + dateFormat.format(dateDue));
    }
    public static void task_2(){
        LocalDate currentDate = LocalDate.now();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input date in format YYYY-MM-DD: ");
        String userInput = scanner.nextLine();

        LocalDate userDate = LocalDate.parse(userInput);
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

    public static boolean check_date(String year, String mont, String day, String hours, String minutes){
        final int[] dayInMonth = {};



        return true;
    }

    public static  void task_4(){
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

        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1,
                Integer.parseInt(day), Integer.parseInt(hours),Integer.parseInt(minutes));

        System.out.println("Созданный Calendar: " + calendar.getTime());

        scanner.close();
    }


    public static void main(String[] args) {
        task_4();
    }
}