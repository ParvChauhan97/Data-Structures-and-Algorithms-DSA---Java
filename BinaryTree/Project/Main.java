package BinaryTree
import java.util.*;

public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        while(true){
            System.out.println("\n1 Insert");
            System.out.println("2 Inorder");
            System.out.println("3 Preorder");
            System.out.println("4 Postorder");
            System.out.println("5 Height");
            System.out.println("6 Count Nodes");
            System.out.println("7 Search");
            System.out.println("8 Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    tree.insert(val);
                    break;

                case 2:
                    tree.inorder(tree.root);
                    break;

                case 3:
                    tree.preorder(tree.root);
                    break;

                case 4:
                    tree.postorder(tree.root);
                    break;

                case 5:
                    System.out.println(tree.height(tree.root));
                    break;

                case 6:
                    System.out.println(tree.countNodes(tree.root));
                    break;

                case 7:
                    System.out.print("Enter value: ");
                    int key = sc.nextInt();
                    System.out.println(tree.search(tree.root, key));
                    break;

                case 8:
                    return;
            }
        }
    }
}
