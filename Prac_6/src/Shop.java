public class Shop implements Printable{
    private final String title;

    public Shop(String title){
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing Shop " + title);
    }

}
