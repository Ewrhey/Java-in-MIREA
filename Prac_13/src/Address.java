import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String input, String delimiters) {
        StringTokenizer tokenizer = new StringTokenizer(input, delimiters);

        if (tokenizer.hasMoreTokens()) {
            this.country = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.region = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.city = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.street = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.house = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.building = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            this.apartment = tokenizer.nextToken().trim();
        }
    }
    public Address(String string){
        String[] parseString = string.split(", ");
        this.country = parseString[0];
        this.region = parseString[1];
        this.city = parseString[2];
        this.street = parseString[3];
        this.house = parseString[4];
        this.building = parseString[5];
        this.apartment = parseString[6];
    }

    @Override
    public String toString() {
        return "Address {" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}