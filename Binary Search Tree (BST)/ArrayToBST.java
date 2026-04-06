class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
       int n = nums.length;
        return convert(nums,0,n-1); 
    }

    public TreeNode convert(int[] nums, int lo, int hi) {
        if(lo>hi) return null;
        int mid = (lo+hi)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convert(nums,lo,mid-1);
        root.right = convert(nums,mid+1,hi);
        return root;
    }
}