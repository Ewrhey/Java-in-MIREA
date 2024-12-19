public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task_1();
        System.out.println("\nTask 2:");
        task_2();
        System.out.print("\nTask 3:");
        task_3();
    }

    public static void task_1() {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        Complex customComplex = factory.createComplex(3, 4);

        System.out.println("Default Complex: " + defaultComplex);
        System.out.println("Custom Complex: " + customComplex);
    }

    public static void task_2() {
        AbstractChairFactory factory = new ChairFactory();

        VictorianChair victorianChair = factory.createVictorianChair(150);
        MagicChair magicChair = factory.createMagicChair();
        FunctionalChair functionalChair = factory.createFunctionalChair();


        Client client = new Client();
        System.out.println("\nClients with victorian chairs:");
        client.setChair(victorianChair);
        client.sit();

        System.out.println("\nClients with magic chairs:");
        client.setChair(magicChair);
        client.sit();
        System.out.println("\nMagic chairs do magic:");
        magicChair.doMagic();

        System.out.println("\nClients with functional chairs:");
        client.setChair(functionalChair);
        client.sit();
        System.out.println("\nSum by functional chairs:");
        System.out.println("Sum: " + functionalChair.sum(5, 7));
    }

    public static void task_3(){
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        Editor editor = new Editor(textDocumentFactory);
        editor.run();
    }
}