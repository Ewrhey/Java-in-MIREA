public class Book implements Printable{
    private final String title;

    public Book(String title){
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing Book " + title);
    }

}
