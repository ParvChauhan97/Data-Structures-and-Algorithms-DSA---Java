//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public int[] searchRange(int[] arr, int tar) {
        // first occurrence
        int lo = 0, hi = arr.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] < tar) lo = mid + 1;
            else if (arr[mid] > tar)  hi = mid - 1;
            else {
                idx = mid;
                hi = mid - 1;
            }
        }

        int first = idx;
        // last occurrence
        lo = 0;
        hi = arr.length - 1;
        idx = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < tar) lo = mid + 1;
            else if (arr[mid] > tar) hi = mid - 1;
            else {
                idx = mid;
                lo = mid + 1;
            }
        }
        int last = idx;
        return new int[]{first, last};
    }
}
