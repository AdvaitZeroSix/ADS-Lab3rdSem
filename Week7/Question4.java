//4. Create a BST from user input and display:
//a. Inorder Traversal
//b. Preorder Traversal
//c. Postorder Traversal
//d. Level Order Traversal
//Verify how the outputs differ.

package Week7;
import java.util.*;
public class Question4 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }
    public static Node insert(Node root, int val) {
        if (root == null) {
            Node newNode = new Node(val);
            return newNode;
        }
        
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        
        return root;
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
    public static void preorder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
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

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        } else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            
            while (!q.isEmpty()) {
                Node current = q.poll();
                System.out.print(current.data + " ");
                
                if (current.left != null) {
                    q.add(current.left);
                }
                
                if (current.right != null) {
                    q.add(current.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
        System.out.print("Preorder Traversal: ");
        preorder(root);
        System.out.println();
        System.out.print("Postorder Traversal: ");
        postorder(root);
        System.out.println();
        System.out.print("Level Order Traversal: ");
        levelOrder(root);
        System.out.println();
    }
}
