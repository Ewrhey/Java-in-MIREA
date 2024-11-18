import java.io.IOException;
import java.util.List;
import java.io.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void num_2(String s) {
        char str = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                str = s.charAt(i);
            }
        }
        String result = Character.toString(str);
        System.out.println("2) Last char: " + result);
    }

    public static void num_3(String s) {
        boolean retVal;

        retVal = s.endsWith("!!!");
        System.out.println("3) Does the string end with a substring '!!!': " + retVal);
    }

    public static void num_4(String s) {
        boolean retVal;

        retVal = s.startsWith("I like");
        System.out.println("4) Does a string begin with a substring 'I like': " + retVal);
    }

    public static void num_5(String s) {
        boolean retVal;

        retVal = s.contains("Java");
        System.out.println("5) Does the string contain a substring 'Java': " + retVal);
    }

    public static void num_6(String s) {
        int index = s.indexOf("Java");
        System.out.println("6) Substring index 'Java': " + index);
    }

    public static void num_7(String s) {
        String newStr = s.replace('a', 'o');
        System.out.println("7) Modified line: " + newStr);
    }

    public static void num_8(String s) {
        s = s.toUpperCase();
        System.out.println("8) Uppercase string: " + s);
    }

    public static void num_9(String s) {
        s = s.toLowerCase();
        System.out.println("9) Lowercase string: " + s);
    }

    public static void num_10(String s) {
        int index = s.indexOf("Java");
        if (index != -1) {
            String result = s.substring(0, index) + s.substring(index + 4);
            System.out.println("10) String without substring 'Java': " + result);
        } else {
            System.out.println("10) Substring 'Java' not found in string.");
        }
    }

    public static void task_1() {
        num_2("Abcde");
        num_3("Abcde");
        num_4("Abcde");
        num_5("Abcde");
        num_6("Abcde");
        num_7("Abcde");
        num_8("Abcde");
        num_9("Abcde");
        num_10("Abcde");
    }

    public static void task_2() {
        Person person = new Person("A", "B", "C");
        System.out.println(person);
    }

    public static void task_3() {
        Address address1 = new Address("A-B-C-D-E-F-G", "-");
        Address address2 = new Address("A, B, C, D, E, F, G");
        System.out.println(address1 + "\n" + address2);
    }

    public static void task_4() {
        String[] shirtsData = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirts = new Shirt[shirtsData.length];

        for (int i = 0; i < shirtsData.length; i++) {
            String[] shirtInfo = shirtsData[i].split(",");
            if (shirtInfo.length == 4) {
                shirts[i] = new Shirt(shirtInfo[0], shirtInfo[1], shirtInfo[2], shirtInfo[3]);
            }
        }

        for (Shirt shirt : shirts) {
            if (shirt != null) {
                System.out.println(shirt + "\n");
            }
        }
    }

    public static void task_5() {
        System.out.println(PhoneNumber.convertNumber("+79175655655"));
        System.out.println(PhoneNumber.convertNumber("+104289652211"));
        System.out.println(PhoneNumber.convertNumber("89175655655"));
    }

    public static List<String> readWordsFromFile(String filePath) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                words.addAll(Arrays.asList(lineWords));
            }
        }
        return words;
    }

    public static String getLine(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        result.append(strings.getFirst());
        strings.removeFirst();

        while (!strings.isEmpty()) {
            String lastWord = result.substring(result.length() - 1).toLowerCase();
            boolean found = false;

            for (int i = 0; i < strings.size(); i++) {
                String word = strings.get(i);
                if (word.toLowerCase().startsWith(lastWord)) {
                    result.append(" ").append(word);
                    strings.remove(i);
                    found = true;
                    break;
                }
            }
            if (!found) {
                break;
            }
        }

        return result.toString();
    }

    public static void task_6(String filePath) {
        try {
            List<String> strings = readWordsFromFile(filePath);
            String result = getLine(strings);
            System.out.println("Result: " + result);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
//        task_1();
//        task_2();
//        task_3();
//        task_4();
//        task_5();
//        task_6(args[0]);

    }
}