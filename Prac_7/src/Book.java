public class Book implements Printable{
    private final String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Printing Book " + title);
    }

    public static void BookFilter(Printable[] printableArray){
        for (Printable i: printableArray){
            if (i instanceof Book)
                System.out.println(((Book) i).getTitle());
        }
    }


}
