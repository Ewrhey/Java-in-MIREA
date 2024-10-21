public class Learner {
    protected String name;
    protected String surname;
    protected int age;
    protected String placeOfStudy;

    public Learner(String name, String surname, int age, String placeOfStudy){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.placeOfStudy = placeOfStudy;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPlaceOfStudy() {
        return placeOfStudy;
    }
}
