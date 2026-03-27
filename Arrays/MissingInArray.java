//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public int missingNumber(int[] arr) {
        long n = arr.length;  // 1 to n
        long sum = n*(n+1)/2;
        long arraySum = 0;
        for(int ele : arr){
            arraySum += ele;
        }
        return (int)(sum - arraySum);
    }
}
