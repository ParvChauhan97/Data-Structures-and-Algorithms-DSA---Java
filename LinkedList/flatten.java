//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node curr = head;
        while(curr != null) {
            if(curr.child == null) curr = curr.next;
            else {
                Node frw = curr.next;
                Node c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
            

                Node temp = c;
                while(temp.next != null) {
                    temp = temp.next;
                }
                    temp.next = frw;
                    if(frw != null) frw.prev = temp;
                    curr = frw;
            }
        }
        return head;
    }
}
