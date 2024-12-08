
import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {
    private static final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public static Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student " + fullName + " not found");
    }

    public List<Student> getStudents() {
        return students;
    }
}