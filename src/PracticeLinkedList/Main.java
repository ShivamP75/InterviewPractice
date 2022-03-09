package PracticeLinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(2);
        ll.insert(4);
        ll.insert(6);
        ll.insert(8);
        ll.display();
        ll.insertAtFirst(1);
        ll.display();
        System.out.println(ll.size);
        ll.remove();
        ll.display();
        System.out.println(ll.size);
    }

}
