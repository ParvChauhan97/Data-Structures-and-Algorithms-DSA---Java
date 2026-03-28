package LinkedList;
import java.util.Scanner;

public class UserInputInNode {
    public static void print(Node Head) {
        Node temp = Head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        Node a = new Node(sc.nextInt());
        System.out.print("Enter the value of b: ");
        Node b = new Node(sc.nextInt());
        System.out.print("Enter the value of c: ");
        Node c = new Node(sc.nextInt());
        System.out.print("Enter the value of d: ");
        Node d = new Node(sc.nextInt());

        a.next = b;
        b.next = c;
        c.next = d;
        print(a);
    }
}
