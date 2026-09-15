//6. Construct an expression tree for:
//(A + B) * (C - D)
//Perform:
//• Preorder traversal
//• Inorder traversal
//• Postorder traversal
//Explain which traversal corresponds to:
//• Prefix notation
//• Infix notation
//• Postfix notation

package Week7;
import java.util.*;
public class Question6 {
    static class Node {
        char data;
        Node left;
        Node right;

        Node(char val) {
            data = val;
            left = null;
            right = null;
        }
    }
    public static void preorder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void postorder(Node root) {
        if (root == null) {
            return;
        } else {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        Node root = new Node('*');
        
        Node plus = new Node('+');
        Node minus = new Node('-');
        root.left = plus;
        root.right = minus;

        plus.left = new Node('A');
        plus.right = new Node('B');

        minus.left = new Node('C');
        minus.right = new Node('D');

        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();
    }
}
