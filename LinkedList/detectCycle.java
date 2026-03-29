//This is Logic only because I'm Solved this question on leetcode.

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
              slow = head;
             
                while(slow != fast) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            } 
        }
        return null;
    }
}
