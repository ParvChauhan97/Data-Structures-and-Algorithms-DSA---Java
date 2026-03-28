//This is Logic only because I'm Solved this question on gfg Practice.

class Solution {
    void printList(Node head) {
        Node slow = head;
        Node fast = head;

        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;

            // cycle detect
            if(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) break;
            }
        }
    }
}
