//This is Logic only because I'm Solved this question on letcode.

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }

    public void postorder(TreeNode node, List<Integer> result) {
        if (node == null) return;

        postorder(node.left, result);   // Left
        postorder(node.right, result);  // Right
        result.add(node.val);           // Root
    }
}
