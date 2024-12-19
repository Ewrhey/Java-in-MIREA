import java.util.Scanner;

public class Editor {
    private IDocument document;
    private final ICreateDocument documentFactory;

    public Editor(ICreateDocument factory) {
        this.documentFactory = factory;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. New Document");
            System.out.println("2. Open Document");
            System.out.println("3. Save Document");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.next();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case "1":
                    newDocument();
                    break;
                case "2":
                    openDocument();
                    break;
                case "3":
                    saveDocument();
                    break;
                case "4":
                    exit();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void newDocument() {
        if (document != null) {
            document.close();
        }
        document = documentFactory.createNew();
        document.open();
    }

    private void openDocument() {
        if (document != null) {
            document.close();
        }
        document = documentFactory.createOpen();
        document.open();
    }

    private void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document is open to save.");
        }
    }

    private void exit() {
        if (document != null) {
            document.close();
        }
        System.out.println("Exiting the editor. Goodbye!");
    }
}