public class StudentDoubleLinkedList {
    private Student head;
    private Student tail;

    public StudentDoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }

    private void setHead(Student head) {
        this.head = head;
    }

    private Student getHead() {
        return head;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void addFirst(String name){
            Student temp = new Student(name);
            if (this.isEmpty())
                this.tail = temp;
            else
                this.head.setPrev(temp);
            temp.setNext(this.head);
            this.head = temp;
    }

    public void addLast(String name){
        Student temp = new Student(name);
        if (this.isEmpty())
            this.tail = temp;
        else
            this.tail.setNext(temp);
        temp.setPrev(this.tail);
        this.tail = temp;
    }

    public void removeFirst(){
        Student temp = this.head;
        if (head.getNext() == null)
            tail = null;
        else
            this.head.getNext().setPrev(null);
        this.head = this.head.getNext();
    }

    public void removeLast(){
        Student temp = this.head;
        if (this.head.getNext() == null)
            this.head = null;
        else
            this.tail.getPrev().setNext(null);
        this.tail = this.tail.getPrev();
    }

    public void clear(){
        while (!(this.head == null))
            this.removeLast();
    }

    public void print(int index){
        if (!this.isEmpty()){
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
        if (!this.isEmpty()){
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
