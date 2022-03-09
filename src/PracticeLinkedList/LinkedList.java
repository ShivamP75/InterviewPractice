package PracticeLinkedList;

public class LinkedList {

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    Node head;
    int size = 0;

    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            this.head = node;
            size++;
        }
        else{
            Node i = head;

            while(i.next !=null){
                i = i.next;
            }
            i.next= node;
            size++;
        }
    }

    public Node remove(){
        if(head == null) {
            size--;
            return null;
        }
        else{
            Node i = head;
            while(i.next.next != null){
                i = i.next;
            }
            Node a = i.next;
            i.next = null;
            size--;
            return a;
        }
    }
    public void insertAtFirst(int data){
        Node node = new Node(data);
        if(head == null) this.head = node;
        else{
            Node i = head;
            this.head = node;
            node.next = i;
            size++;
        }
    }

//    removeAtFirst;
//


    public void display(){
        if(head == null) System.out.println("Null");
        else{
            Node i = head;
            while(i != null){
                System.out.print(i.data  + " - > ");
                i = i.next;
            }
            System.out.println("Null");
        }
    }



}
