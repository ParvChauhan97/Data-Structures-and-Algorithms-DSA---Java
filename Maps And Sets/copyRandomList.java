class Solution {

    public Node deepCopy(Node head) {
        Node temp1 = head;
        Node dummy = new Node(-1);
        Node temp2 = dummy;
        while (temp1 != null) {
            Node newNode = new Node(temp1.val);
            temp2.next = newNode;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return dummy.next;
    }

    public Node copyRandomList(Node head) {
        Node copyHead = deepCopy(head);
        HashMap<Node, Node> map = new HashMap<>();
        Node tempA = head;
        Node tempB = copyHead;

        map.put(null, null);
        while (tempA != null) {
            map.put(tempA, tempB);
            tempA = tempA.next;
            tempB = tempB.next;
        }
        tempA = head;

        while (tempA != null) {
            tempB = map.get(tempA);
            tempB.random = map.get(tempA.random);
            tempA = tempA.next;
        }
        return copyHead;
    }
}
