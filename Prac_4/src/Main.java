
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    private static User[] usersArrayGen(int numberUsers) {
        Scanner scn = new Scanner(System.in);
        User[] usersArray = new User[numberUsers];
        for (int i = 0; i < usersArray.length; i++) {
            System.out.println("Input username " + (i + 1) + ":");
            usersArray[i] = new User(scn.nextLine(), "d");
            System.out.println("Input password " + (i + 1) + ":");
            usersArray[i].setPassword(scn.nextLine());
        }
        System.out.println("userArray: ");
        for (User user : usersArray) {
            System.out.println("Username: " + user.getUsername() + " Password: " + user.getPassword());
        }
        return usersArray;
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input number of users from 2 to 10: ");
        int numberUsers = scn.nextInt();
        if (numberUsers >= 2 && numberUsers <= 10) {
            User[] usersArray = usersArrayGen(numberUsers);

            System.out.println("Input username:");
            String tryName = scn.next();
            System.out.println("Input password:");
            String tryPassword = scn.next();
            boolean flag = false;
            for (int i = 0; (i < numberUsers && !flag); i++) {
                System.out.println("\nUser " + (i + 1) + ":");
                if (usersArray[i].checkPasswordAndUsername(tryName, tryPassword)) {
                    flag = true;
                    System.out.println("Successful login!\n");
                }
            }
            if (flag) {
                System.out.println("Title of categories: ");
                System.out.print(Arrays.toString(Shop.Categories.values()));
                System.out.println();
                System.out.println("Choice categories: \n1 - Books\n2 - Office");
                switch (scn.next()) {
                    case "1":
                        System.out.println("Title of product in category: ");
                        System.out.println(Arrays.toString(Shop.Books.values()));
                        Shop.Books[] shoppingCarBooks = new Shop.Books[6];
                        System.out.println("Input number of product in category to append this product in shopping cart or input 0 to proceed to payment: ");
                        int i1 = scn.nextInt(), k1 = 0;
                        while (i1 != 0) {
                            shoppingCarBooks[k1] = Shop.Books.values()[i1 - 1];
                            k1++;
                            i1 = scn.nextInt();
                        }
                        System.out.print("Shopping cart contents: ");
                        for (Shop.Books j : shoppingCarBooks) {
                            if (j != null)
                                System.out.print(j);
                        }
                        System.out.print("\nInput card number and CVC-code :) ");
                        break;
                    case "2":
                        System.out.println("Title of product in category: ");
                        System.out.print(Arrays.toString(Shop.Office.values()));
                        Shop.Office[] shoppingCarOffice = new Shop.Office[6];
                        System.out.println("Input number of product in category to append this product in shopping cart or input 0 to proceed to payment: ");
                        int i2 = scn.nextInt(), k2 = 0;
                        while (i2 != 0) {
                            shoppingCarOffice[k2] = Shop.Office.values()[i2 - 1];
                            i2 = scn.nextInt();
                            k2++;
                        }
                        System.out.print("Shopping cart contents: ");
                        for (Shop.Office j : shoppingCarOffice) {
                            if (j != null)
                                System.out.print(j);
                        }
                        System.out.print("\nInput card number and CVC-code :) ");
                        break;
                    default:
                        System.out.println("Incorrect number of categories");
                }
            }


        } else
            System.out.println("Incorrect number of users");
    }
}
