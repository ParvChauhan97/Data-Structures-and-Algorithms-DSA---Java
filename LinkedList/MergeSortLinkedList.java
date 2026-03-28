//This is Logic only because I'm Solved this question on gfg.

class Solution {
    public Node mergeSort(Node head) {
       Node slow = head;
       Node fast = head;
       Node head1 = head;
       if(head == null || head.next == null) return head;
         
       while(fast.next != null && fast.next.next != null) {
           slow = slow.next;
           fast = fast.next.next;
       }   
           Node head2 = slow.next;
           slow.next = null;
           
           head1 = mergeSort(head1);
           head2 = mergeSort(head2);
           return merge(head1, head2);
    }
    
    static Node merge(Node head1, Node head2){
        Node i = head1;
        Node j = head2;
        Node Dummy = new Node(-1);
        Node k = Dummy;
        while(i != null && j != null) {
            if(i.data < j.data) {
                k.next = i;
                i = i.next;
            }
            else {
                k.next = j;
                j = j.next;
            }
            k = k.next;
          }
            if(i == null) k.next = j;
            else k.next = i;
        
            return Dummy.next;
    }
}
