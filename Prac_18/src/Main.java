import java.util.Scanner;
public class Main {
    private static class Task_1{
        public static void exceptionDemo() {
//        Такое поведение характерно для стандарта IEEE 754 для чисел с плавающей запятой.
//        В Java, при попытке выполнить целочисленное деление на ноль, будет сгенерировано
//        исключение ArithmeticException, поскольку в целых числах деление на ноль не имеет определения в математике.
            System.out.println(2.0 / 0.0);
        }
        public static void exception() {
            try {
                System.out.println(2 / 0);
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
    }

    private static class Task_2 {
        public static void exception() {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter an integer");
                String intString = scanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
        }
//        java.lang.NumberFormatException: Это исключение выбрасывается, когда вы пытаетесь преобразовать строку в число
//        с использованием Integer.parseInt(intString), а введенная строка не является допустимым целым числом
//        java.lang.ArithmeticException: Это исключение выбрасывается, когда вы пытаетесь выполнить деление на ноль
    }

    private static class Task_3 {
        public static void exception() {
            Scanner myScanner = new Scanner(System.in);
            try {
                System.out.println("Enter an integer");
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
//            В Java, при обработке исключений, catch блоки должны быть упорядочены таким образом,
//            чтобы наиболее специфичные исключения обрабатывались перед более общими.
            } catch (Exception e) {
                System.out.println("Exception error");
            }
        }

//        java.lang.NumberFormatException: Это исключение выбрасывается, когда вы пытаетесь преобразовать строку в число
//        с использованием Integer.parseInt(intString), а введенная строка не является допустимым целым числом

//        java.lang.ArithmeticException: Это исключение выбрасывается, когда вы пытаетесь выполнить деление на ноль

    }

    private static class Task_4 {
        public static void exception() {
            Scanner myScanner = new Scanner(System.in);
            try {
                System.out.println("Enter an integer");
                String intString = myScanner.next();
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            }
//        finally используется для закрытия сканнера (myScanner), чтобы гарантировать,
//        что ресурсы освобождаются надежно, даже если возникнет исключение.
            finally {
                myScanner.close();
            }
        }
//        java.lang.NumberFormatException: Это исключение выбрасывается, когда вы пытаетесь преобразовать строку в число
//        с использованием Integer.parseInt(intString), а введенная строка не является допустимым целым числом

//        java.lang.ArithmeticException: Это исключение выбрасывается, когда вы пытаетесь выполнить деление на ноль
    }

    private static class Task_5 {
        public static void printMessage(String key) {
            String message = getDetails(key);
            System.out.println(message);
        }

        public static String getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails ");
            }
            return "data for " + key;
        }

        public static void exception() {
            printMessage("");
        }
    }

    private class Task_6 {
        public static void printMessage(String key) {
            String message = getDetails(key);
            System.out.println(message);
        }

        public static String getDetails(String key) {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for " + key;
        }

        public static void exception() {
            printMessage("Hello");
            try {
                printMessage(null);
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException" + e.getMessage());
            }
        }
    }

    private static class Task_7 {
        public static void getKey() {
            Scanner scanner = new Scanner(System.in);
            try {
                String key = scanner.next();
                printDetails(key);
            }
            catch (Exception e){
                System.out.println("Caught Exception: " + e.getMessage());
            }

        }

        public static void printDetails(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }

        //добавить try-catch блоки таким образом, чтобы в конечном итоге один из них обрабатывал исключение
        private static String getDetails(String key) {
            try {
                if (key.isEmpty()) {
                    throw new Exception("Key set to empty string");
                }
                return "data for " + key;
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                return "data for " + key;
            }
        }

        public static void exception() {
            getKey();
        }
    }

    private static class Task_8 {
        public static void getKey() {
            Scanner scanner = new Scanner(System.in);
            try {
                String key = scanner.next();
                printDetails(key);
            }
            catch (Exception e){
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }

        public static void printDetails(String key) {
            try {
                String message = getDetails(key);
                System.out.println(message);
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                // Добавим цикл для предоставления пользователю второго шанса
                System.out.println("Please enter the key again:");
                getKey();
            }
        }

        private static String getDetails(String key) {
            try {
                if (key.isEmpty()) {
                    throw new Exception("Key set to empty string");
                }
                return "data for " + key;
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                // Теперь метод getDetails возвращает null, чтобы показать ошибку,
                // исключение было обработано в printDetails
                return null;
            }
        }

        public static void exception() {
            getKey();
        }
    }

    public static void main(String[] args) {
//        System.out.println("Task 1:");
//        Task_1.exception();
//        System.out.println("\nTask 2:");
//        Task_2.exception();
//        System.out.println("\nTask 3:");
//        Task_3.exception();
//        System.out.println("\nTask 4:");
//        Task_4.exception();
//        System.out.println("\nTask 5:");
//        Task_5.exception();
//        System.out.println("\nTask 6:");
//        Task_6.exception();
//        System.out.println("\nTask 7:");
//        Task_7.exception();
//        System.out.println("\nTask 8:");
//        Task_8.exception();


    }
}