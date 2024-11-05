public class Main {

    private static void task_2_3(){
                MovablePoint point = new MovablePoint(1,2,3,4);
                MovableRectangle rect = new MovableRectangle(
                        11, 1,
                        21, 11,
                        8, 9,
                        8, 9
                );

                System.out.println("Test MovablePoint:");
                System.out.println("Before moving:\n" + point);
                point.moveDown();
                point.moveRight();
                System.out.println("\nAfter moving:\n" + point);

                System.out.println("\nTest MovableRectangle:");
                System.out.println("Before moving:\n" + rect);
                if (rect.checkSameSpeed()) {
                    rect.moveUp();
                    rect.moveRight();
                    System.out.println("\nAfter moving:\n" + rect);
                }
                else {
                    System.out.println("\nRectangle can't moving because speeds aren't equal\n");
                }

    }

    private static void task_5_6() {
        String string = "Testing string: Hello, World!";
        ProcessString processString = new ProcessString();
        System.out.println("Len string:  " + processString.len(string) +
                "\nOnly odd chars:  " + processString.oddChar(string) +
                "\nRevers string:  " + processString.inversionString(string));


    }

    private static void task_7_8() {
        Printable[] printableArray = new Printable[6];
        printableArray[0] = new Book("1984");
        printableArray[1] = new Shop("TestShop 1");
        printableArray[2] = new Book("451 F");
        printableArray[3] = new Shop("TestShop 2");
        printableArray[4] = new Shop("TestShop 3");
        printableArray[5] = new Shop("testShop 4");
        System.out.println("Books:");
        Book.BookFilter(printableArray);
        System.out.println("\nShops:");
        Shop.ShopFilter(printableArray);
    }

    public static void main(String[] args) {
        //task_7_8();
        //task_5_6();
        task_2_3();
    }
}