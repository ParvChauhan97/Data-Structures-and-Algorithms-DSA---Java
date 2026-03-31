package Queues;
import java.util.LinkedList;
import java.util.Queue;

public class BacisStructureOfQueues {
    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i=1;i<=n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        display(q);
    }
