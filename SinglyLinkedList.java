import java.io.*;
public class SinglyLinkedList {
    // Represent a Node of Singly Linked List
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Represent the head and tail of the Linked List
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        //Checks if the list is empty
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delNode(){
        //Checks if the linked list is empty
        if(head == null)
            System.out.println("Empty");
        // When only a single element is present in the linked list
        else if(head == tail){
            int delVal = head.data;
            head = tail = null;
            System.out.println(delVal+" deleted");
        }
        else{
            Node current = head;
            //Traverse till the last node
            while(current.next != tail){
                current = current.next;
            }
            tail = current;
            current.next = null;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Empty");
        }
        else {
            Node start = head;
            while(start != null){
                System.out.println(start.data + " ");
                start = start.next;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList sll = new SinglyLinkedList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int option;

        System.out.println("********Menu*******");
        System.out.println("1. Input");
        System.out.println("2. Delete End Node");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        

        do{
            System.out.println("Enter Youtr choice : ");
            option = Integer.parseInt(br.readLine());

            switch(option){
                case 1 : sll.addNode(Integer.parseInt(br.readLine()));
                break;
                case 2 : sll.delNode();
                break;
                case 3 : sll.display();
                break;
                default : System.out.println("Enter correct option");
                break;
            }
        }while(option != 4);

    }
}
