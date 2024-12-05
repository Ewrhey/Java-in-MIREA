import java.util.Scanner;

public class Main {

    public static void task_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:" +
                           "\n1 - Add first\n2 - Remove by name or index\n3 - Remove by name and number of deletions" +
                           "\n4 - Clear\n5 - Print list\n6 - Print elem\n7 - is Empty\nSomething else - exit");
        boolean flag = true;
        StudentLinkedList list = new StudentLinkedList();
        while (flag){
            System.out.println("Input command:");
            switch (scanner.next()){
                case "1":
                    System.out.println("Input name:");
                    list.addStudent(scanner.next());
                    break;
                case "2":
                    System.out.println("Input name or index:");
                    if (scanner.hasNextInt())
                        list.removeStudent(scanner.nextInt());
                    else
                        list.removeStudent(scanner.next());
                    break;
                case "3":
                    System.out.println("Input name:");
                    String name = scanner.next();
                    System.out.println("Input number of deletions:");
                    list.removeStudent(name, scanner.nextInt());
                    break;
                case "4":
                    list.clear();
                    break;
                case "5":
                    System.out.println(list);
                    break;
                case "6":
                    System.out.println("Input index:");
                    list.print(scanner.nextInt());
                    break;
                case "7":
                    if (list.isEmpty())
                        System.out.println("List is empty");
                    else
                        System.out.println("List is not empty");
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }


    public static void task_2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:" +
                           "\n1 - Add first\n2 - Add last\n3 - Remove first\n4 - Remove last" +
                           "\n5 - Clear\n6 - Print list\n7 - Print elem\n8 - is Empty\nSomething else - exit");
        boolean flag = true;
        StudentDoubleLinkedList list = new StudentDoubleLinkedList();
        while (flag){
            System.out.println("Input command:");
            switch (scanner.next()){
                case "1":
                    System.out.println("Input name:");
                    list.addFirst(scanner.next());
                    break;
                case "2":
                    System.out.println("Input name:");
                    list.addLast(scanner.next());
                    break;
                case "3":
                    list.removeFirst();
                    break;
                case "4":
                    list.removeLast();
                    break;
                case "5":
                    list.clear();
                    break;
                case "6":
                    System.out.println(list);
                    break;
                case "7":
                    System.out.println("Input index:");
                    list.print(scanner.nextInt());
                    break;
                case "8":
                    if (list.isEmpty())
                        System.out.println("List is empty");
                    else
                        System.out.println("List is not empty");
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }

    public static void task_3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:" +
                           "\n1 - Add first\n2 - Remove by name or index\n3 - Remove by name and number of deletions" +
                           "\n4 - Clear\n5 - Print list\n6 - Print elem\n7 - is Empty\nSomething else - exit");
        boolean flag = true;
        StudentRingLinkedList list = new StudentRingLinkedList();
        while (flag){
            System.out.println("Input command:");
            switch (scanner.next()){
                case "1":
                    System.out.println("Input name:");
                    list.addStudent(scanner.next());
                    break;
                case "2":
                    System.out.println("Input name or index:");
                    if (scanner.hasNextInt())
                        list.removeStudent(scanner.nextInt());
                    else
                        list.removeStudent(scanner.next());
                    break;
                case "3":
                    System.out.println("Input name:");
                    String name = scanner.next();
                    System.out.println("Input number of deletions:");
                    list.removeStudent(name, scanner.nextInt());
                    break;
                case "4":
                    list.clear();
                    break;
                case "5":
                    System.out.println(list);
                    break;
                case "6":
                    System.out.println("Input index:");
                    list.print(scanner.nextInt());
                    break;
                case "7":
                    if (list.isEmpty())
                        System.out.println("List is empty");
                    else
                        System.out.println("List is not empty");
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        //task_1();
        //task_2();
        //task_3();






    }
}