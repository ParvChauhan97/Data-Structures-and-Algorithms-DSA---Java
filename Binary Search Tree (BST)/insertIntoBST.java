//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    void attach (TreeNode root, int val) {
       if(root.val == val) return;
       
       if(root.val < val) {
        if(root.right == null) {
            TreeNode x = new TreeNode(val);
            root.right = x;
            return;
        }
        attach(root.right, val);
       }
       if(root.val > val) {
        if(root.left == null) {
            TreeNode x = new TreeNode(val);
            root.left = x;
            return;
        }
        attach(root.left, val);
       }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
       attach(root, val);
       return root;
    }
}
