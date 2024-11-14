import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {

    private String name, surname, speciality, group;
    private int klass, GPA, ID;
    private LocalDate dateOfBirth;
    public Student(String name, String surname, String speciality, String group,
                   int klass, int GPA, int ID, LocalDate dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.klass = klass;
        this.group = group;
        this.GPA = GPA;
        this.ID = ID;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getKlass() {
        return klass;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String formatBirthDate(DateTimeFormatter formatter) {
        return dateOfBirth.format(formatter);
    }

    @Override
    public String toString() {
        return "Name and surname: " + getName() + " " + getSurname() +
                "\nSpeciality and group: " + getSpeciality() + " " + getGroup()
                + "\nKlass: " + getKlass() + "\nGPA: " + getGPA() + "\nID: " + getID()
                + "\ndate of birth: " + getDateOfBirth() + "\n";
    }

}