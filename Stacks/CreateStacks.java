package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class CreateStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> st = new Stack<>();
        Stack<String> st2 = new Stack<>();
        st.add("Rahul");  //add() <==> push()
        st.push("Rajat");
        st.push("Mohit");
        st.push("Parv");
        st.push("Ritik");

        System.out.println(st);
        System.out.print("Enter the index number b/w 1 to 4 to get value: ");
        int idx = sc.nextInt();

        if(idx >= st.size()) {
            System.out.println("Enter the valid index");
            return;
        }
        else {
            while(st.size() > idx+1) {
                st2.push(st.pop());
            }
        }
        System.out.println(st.peek());
    }
}
