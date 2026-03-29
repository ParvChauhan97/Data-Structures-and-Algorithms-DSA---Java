package LinkedList;
import java.util.Scanner;

public class CreateOwnDataStracture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linkedlist ll = new Linkedlist();

        //Add at Tail
        ll.addAtTail(30);
        ll.addAtTail(60);
        ll.addAtTail(90);
        ll.display();
        System.out.println();

        //Add at Head
        ll.addAtHead(10);
        ll.display();
        System.out.println();
        ll.addAtHead(20);

        //Display
        ll.display();
        System.out.println();

        //Delete At Head
        ll.deleteAtHead();
        ll.display();
        System.out.println();

        //Size printing of the LinkedList
        System.out.println(ll.size);

        //Insert Value Middle of a LinkedList
        ll.Insert(120,3);
        ll.display();
        System.out.println();

        //Delete any node using index value
        ll.delete(2);
        ll.display();
    }
}
