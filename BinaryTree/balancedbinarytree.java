//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int LeftTree = levels(root.left);
        int RightTree = levels(root.right);
        if(Math.abs(LeftTree - RightTree) >1 ) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private static int levels(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
}
