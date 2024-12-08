

public class Student{
    private final String name;
    private final int GPA;

    public Student(String name, int GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }


    @Override
    public String toString() {
        return "Student: " + name +" GPA: " + GPA ;
    }
}