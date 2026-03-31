//This is Logic only because I'm Solved this question on gfg Practice.

class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        
        Stack<Integer> st = new Stack<>();
        int n = q.size();
    
        for(int i = 0; i < n/2; i++){
            st.push(q.remove());
        }
   
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        for(int i = 0; i < n/2; i++){
            q.add(q.remove());
        }
       
        for(int i = 0; i < n/2; i++){
            st.push(q.remove());
        }
       
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
    }
}
