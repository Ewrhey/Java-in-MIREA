public class Shop implements Printable{
    private final String title;

    public Shop(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Printing Shop " + title);
    }
    public static void ShopFilter(Printable[] printableArray){
        for (Printable i: printableArray){
            if (i instanceof Shop)
                System.out.println(((Shop) i).getTitle());
        }
    }

}
