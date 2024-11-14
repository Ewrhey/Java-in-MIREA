import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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



    public static void main(String[] args) {

    }
}