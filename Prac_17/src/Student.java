public class Student {
    private String name;
    private Student next;
    private Student prev;
    public Student (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public Student getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n";
    }

    public Student getPrev() {
        return prev;
    }

    public void setPrev(Student prev) {
        this.prev = prev;
    }
}
