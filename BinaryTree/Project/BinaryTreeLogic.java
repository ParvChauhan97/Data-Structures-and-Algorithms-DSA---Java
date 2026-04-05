package BinaryTree;
import java.util.*;

class BinaryTree {
    TreeNode root;

    public void insert(int val){
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val){
        if(root == null) return new TreeNode(val);
        if(val < root.val) root.left = insertRec(root.left, val);
         else {
           root.right = insertRec(root.right, val);
        }
        return root;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int countNodes(TreeNode root){
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public boolean search(TreeNode root, int key){
        if(root == null) return false;
        if(root.val == key) return true;
        return search(root.left, key) || search(root.right, key);
    }
}
