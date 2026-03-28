//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode curr = head;
      ListNode forw = null;
      ListNode pre = null;

      while(curr != null) {
        forw = curr.next;
        curr.next = pre;
        pre = curr;
        curr = forw;
      }
      return pre;
    }
}
