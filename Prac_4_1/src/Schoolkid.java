public class Schoolkid extends Learner{
    protected int classAtSchool;
    protected int annualAssessment;

    public Schoolkid(String name, String surname, int age, String placeOfStudy, int classAtSchool,
                     int annualAssessment) {
        super(name, surname, age, placeOfStudy);
        this.classAtSchool = classAtSchool;
        this.annualAssessment = annualAssessment;
    }

    public int getAnnualAssessment() {
        return annualAssessment;
    }

    public int getClassAtSchool() {
        return classAtSchool;
    }

    @Override
    public String toString() {
        return "Student " + getName() + " " + getSurname() + " studying in " + getPlaceOfStudy()
                + " in the " + getClassAtSchool() + " class and have annual assessment: " + getAnnualAssessment();
    }

}
