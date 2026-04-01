//This is Logic only because I'm Solved this question on gfg Practice.

class Solution {
    public static int gcd(int a, int b) {
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
