//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        levels(root);
        return max;
    }

    int levels(TreeNode root) {
        if(root == null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        max = Math.max(max, leftLevels + rightLevels);
        return 1 + Math.max(leftLevels, rightLevels);
    }
}
