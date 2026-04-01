//This is Logic only because I'm Solved this question on gfg Practice.

class Solution {
    int c(int n) {
      if(n==0 || n==1) return 1;
        return n*factorial(n-1);
    }
}
