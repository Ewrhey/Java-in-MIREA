public class Student implements Comparable<Student>{
    private String name;
    private int id;
    private double GPA;

    public Student(String name, int id, double GPA) {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getGPA() {
        return this.GPA;
    }

    @Override
    public int compareTo(Student otherStudent) {
        if (getGPA() < otherStudent.getGPA()) {
            return -1;
        }
        else if (getGPA() > otherStudent.getGPA()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nID: " + getID() + "\nGPA student: " + getGPA();
    }
}