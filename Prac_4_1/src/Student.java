public class Student extends Learner{
    protected int curs;
    protected int scholarship;

    public Student(String name, String surname, int age, String placeOfStudy, int curs, int scholarship) {
        super(name, surname, age, placeOfStudy);
        this.curs = curs;
        this.scholarship = scholarship;
    }

    public int getCurs() {
        return curs;
    }

    public int getScholarship() {
        return scholarship;
    }

    @Override
    public String toString() {
        return "Student " + getName() + " " + getSurname() + " studying in " + getPlaceOfStudy()
                + " in the " + getCurs() + " curs and have scholarship: " + getScholarship();
    }
}
