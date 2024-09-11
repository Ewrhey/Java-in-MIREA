import java.util.Scanner;

public class Main {
    private static boolean isWord(String s) {
        String alf = "QWERTYUIIOPSDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        for (String i : s.split(""))
            if (!alf.contains(i))
                return false;
        return true;
    }

    private static void task_7() {
        Scanner scan = new Scanner(System.in);
        Book book = new Book("1984", "George Orwell", "Dystopian novel", "1949");
        System.out.println("\nTesting get-methods:\nAuthor name: " + book.getAuthorName() + "\nAuthor surname: " + book.getAuthorSurname()
                + "\nAuthor: " + book.getAuthor() + "\nBook genre: " + book.getGenre()
                + "\nBook Year of writing: " + book.getYearOfWriting() + "\nBook title: " + book.getTitle());

        System.out.print("\nTesting set-methods:\nInput new title: ");
        book.setTitle(scan.nextLine());
        System.out.print("Input new author: ");
        book.setAuthor(scan.nextLine());
        System.out.print("Input new genre: ");
        book.setGenre(scan.nextLine());
        System.out.print("Input new year of writing: ");
        book.setYearOfWriting(scan.nextLine());

        System.out.println("\nBook after change:\nAuthor: " + book.getAuthor() + "\nBook genre: " + book.getGenre()
                + "\nBook Year of writing: " + book.getYearOfWriting() + "\nBook title: " + book.getTitle());
    }

    private static void task_8() {
        String[] strArray = {"Aa", "Bb", "Cc", "Dd", "Ee"};
        System.out.print("Array after change: ");
        for (String s : strArray)
            System.out.print(s + " ");
        System.out.println();
        String temple;
        int j = strArray.length - 1;
        for (int i = 0; i < strArray.length/2; i++) {
            temple = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temple;
            j--;
        }
        System.out.print("Array before change: ");
        for (String s : strArray)
            System.out.print(s + " ");
        System.out.println();
    }

    private static void task_10(String[] args) {
        int numberWords = 0;
        System.out.println("Words in command line: ");
        for (String s : args)
            if (isWord(s)) {
                System.out.println(s);
                numberWords++;
            }
        System.out.println("\nNumber of words in command line: \n" + numberWords);
    }

    public static void main(String[] args) {
        task_7();
        task_10(args);
        task_8();
    }
}
