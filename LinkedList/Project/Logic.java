class Linkedlist {
    Node Head;
    Node Tail;
    int size;

   void addAtTail(int val) {
       Node temp = new Node(val);
       if(Head == null) Head = Tail = temp;
       else {
           Tail.next = temp;
           Tail = temp;
       }
       size++;
   }
    void display() {
        Node temp = Head;
        if(Head == null) return;
        while(temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    void addAtHead(int value){
       Node temp = new Node(value);
       if(Head == null) Head = Tail = temp;
       else {
           temp.next = Head;
           Head = temp;
       }
       size++;
    }
    void deleteAtHead(){
       if(Head == null) {
           System.out.print("Node is empty");
           return;
       }
      Head = Head.next;
      
     //If the LinkedList has only one node and the head becomes null, then the tail must also be set to null.
       if(Head==null) Tail = null;
       size--;
    }
    void Insert(int val, int idx) {
       if(idx<0 || idx>size) System.out.print("Invalid Index");
       else if(idx==0) addAtHead(val);
       else if(idx==size) addAtTail(val);
       else{
           Node temp = Head;

          //Using a loop, move to the node just before the index where the new node needs to be inserted.
           for(int i =1; i<=idx-1; i++){
               temp = temp.next;
           }
           //Then create a new node.
           Node t = new Node(val);
           t.next = temp.next;
           temp.next = t;
           size++;
       }
    }
    void delete(int idx){
       if(idx<0 || idx>=size) {
           System.out.print("Invalid Index");
           return;
       }
       Node temp = Head;
       for(int i =1; i<=idx-1; i++){
           temp = temp.next;
       }
       temp.next = temp.next.next; //delete Node...
        if(idx == size-1) Tail = temp; //deleting Tail...
        size--;
    }
}
