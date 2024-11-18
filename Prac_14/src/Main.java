import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void task_2() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        String regex = "^abcdefghijklmnopqrstuv18340$";

        Pattern pattern = Pattern.compile(regex);

        boolean isMatch = pattern.matcher(string).matches();

        System.out.println("Coincidence: " + isMatch);
    }
    public static void task_4() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String regex = "\\d(?!\\+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);

        if (matcher.find()) {
            System.out.println("There are numbers in the text that are not followed by a sign '+'");
        } else {
            System.out.println("There aren't numbers in the text that are not followed by a sign '+'");
        }
    }
    public static void task_5() {
        String date = new Scanner(System.in).next();

//      (0[1-9]|[12][0-9]|3[01]): Эта часть шаблона соответствует дню месяца. Здесь допустимы дни с 01 до 31
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$";
        if (date.matches(regex))
            System.out.println("Correct date");
        else
            System.out.println("Incorrect date");

    }

    public static void task_7() {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        String password = new Scanner(System.in).next();
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            System.out.println("Correct password: " + password);
        else
            System.out.println("Incorrect password: " + password);
    }

    public static void main(String[] args) {
//        task_2();
//        task_4();
//        task_5();
//        task_7();

    }
}