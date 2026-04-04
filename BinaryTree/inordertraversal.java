//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr;
    }
}
