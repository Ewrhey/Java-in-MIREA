public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening a text document.");
    }

    @Override
    public void save() {
        System.out.println("Saving the text document.");
    }

    @Override
    public void close() {
        System.out.println("Closing the text document.");
    }
}