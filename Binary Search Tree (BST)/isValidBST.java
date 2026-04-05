//This is Logic only because I'm Solved this question on leetcode.

class Solution {
    public void inorder(TreeNode root, ArrayList<Integer> arr) {
        if(root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public boolean isValidBST(TreeNode root) {
       ArrayList<Integer> arr = new ArrayList<>();
       inorder(root, arr);
       for(int i=0; i<=arr.size()-2; i++) {
        if(arr.get(i) >= arr.get(i+1)) {
            return false;
           }
        }
       return true;
    }
}
