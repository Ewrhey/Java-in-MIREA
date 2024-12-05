public class StudentRingLinkedList {
    private Student head;
    public StudentRingLinkedList(){
        this.head  = null;
    }

    private void setHead(Student head) {
        this.head = head;
    }

    public Student getHead() {
        return head;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addStudent(String name){
        boolean flag = false;
        if (!isEmpty()) {
            flag = this.head.getNext() == null;
        }
        Student temp = new Student(name);
        temp.setNext(head);
        this.head = temp;
        if (flag){
            this.head.getNext().setNext(this.head);
        }
    }

    public void removeStudent(String name){
        Student temp = this.getHead();
        while (this.isEmpty() && this.head.getName() == name )
            this.setHead(this.head.getNext());
        while (this.isEmpty() && !(temp.getNext() == null)){
            if (temp.getNext().getName() == name){
                temp.setNext(temp.getNext().getNext());
            }
            else
                temp = temp.getNext();
        }
    }
    public void removeStudent(String name, int number){
        Student temp = this.getHead();
        int counter = 0;
        while (this.isEmpty() && this.head.getName() == name ){
            this.setHead(this.head.getNext());
            counter++;
        }
        while (this.isEmpty() && !(temp.getNext() == null) && (counter < number - 1)){
            if (temp.getNext().getName() == name){
                temp.setNext(temp.getNext().getNext());
                counter++;
            }
            else
                temp = temp.getNext();
        }
    }

    public void removeStudent(int index){
        Student temp = this.getHead();
        int count = 0;
        if (this.isEmpty() && index == 0)
            this.head = this.head.getNext();
        while (this.isEmpty() && !(temp.getNext() == null)){
            if (count == index - 1){
                temp.setNext(temp.getNext().getNext());
                return;
            }
            temp = temp.getNext();
            count ++;
        }
    }

    public void clear(){
        while (this.isEmpty())
            this.removeStudent(0);
    }

    public void print(int index){
        if (this.isEmpty()){
            Student temp = this.getHead();
            int count = 0;
            while (!(temp == null)){
                if (count == index){
                    System.out.println(temp);
                    return;
                }
                temp = temp.getNext();
                count ++;
            }
        }
        else
            System.out.println("Error: Empty list");
    }

    @Override
    public String toString() {
        if (this.isEmpty()){
            Student temp = this.getHead();
            String output = "";
            int count = 0;
            while (!(temp == null)){
                output = output + "Student " + count + ": " + temp.toString();
                temp = temp.getNext();
                count ++;
            }
            return output;
        }
        else
            return "Error: Empty list";
    }
}
