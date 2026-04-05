//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public TreeNode searchBST(TreeNode root, int x) {
        if(root == null) return root;
        if(root.val == x) return root;
        if(root.val < x) return searchBST(root.right, x);
        else return searchBST(root.left, x);
    }
}
