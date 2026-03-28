//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public void deleteNode(ListNode target) {
        target.val = target.next.val;
        target.next = target.next.next;
    }
}
