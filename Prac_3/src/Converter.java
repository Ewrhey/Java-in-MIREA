
import java.util.Scanner;

public class Converter {
    private double priceRuble;
    public Converter(double priceRuble)
    {
        this.priceRuble = priceRuble;
    }

    private double getPriceRuble()
    {
        return priceRuble;
    }
    private double getPriceDollar()
    {
        return priceRuble * 90.94;
    }
    private double getPriceShekel()
    {
        return priceRuble * 24.42;
    }
    private double getPriceZloty()
    {
        return priceRuble * 23.65;
    }

    private void setPriceRuble(double priceRuble){
        this.priceRuble = priceRuble;
    }

    public void menu(){
        Scanner scn = new Scanner(System.in);
        String finish = "0";
        while (finish == "0")
        {
            System.out.print("Input price in ruble: ");
            setPriceRuble(scn.nextDouble());
            System.out.println("Choice currency:\n1 - RUB\n2 - USD\n3 - ILS\n4 - PLN\nSomething else - exit");
            String cur = scn.next();
            switch (cur) {
                case "1":
                    System.out.println("Answer: " + getPriceRuble());
                    break;
                case "2":
                    System.out.println("Answer: " + getPriceDollar());
                    break;
                case "3":
                    System.out.println("Answer: " + getPriceShekel());
                    break;
                case "4":
                    System.out.println("Answer: " + getPriceZloty());
                    break;
                default:
                    finish = "1";
            }
        }
    }
}
