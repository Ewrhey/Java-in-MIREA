import java.util.Comparator;

public class StudentComparatorGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGPA() > o2.getGPA()) return 1;
        else if (o1.getGPA() < o2.getGPA()) return -1;
        return 0;
    }
}
