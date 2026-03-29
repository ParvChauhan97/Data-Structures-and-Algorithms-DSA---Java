package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class addAtBottemUsingResursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(78);
        st.push(3);
        st.push(8);
        st.push(90);
        st.push(12);
        st.push(56);
        System.out.println(st);

        int n = sc.nextInt();
        botRec(st , n);
        System.out.println(st);
    }
    public static void botRec(Stack<Integer> st, int data) {
        if(st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        botRec(st, data);
        st.push(top);
    }
}
