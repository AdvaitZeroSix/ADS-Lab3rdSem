//2. Write a recursive Java program to determine the height of a Binary Tree.
package Week7;
import java.util.*;
public class Question2 {
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
    public static int findHeight(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = findHeight(root.left);
            int rightHeight = findHeight(root.right);
            
            if (leftHeight > rightHeight) {
                return 1 + leftHeight;
            } else {
                return 1 + rightHeight;
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);   
        Node second = new Node(2);
        Node third = new Node(3);
        root.left = second;
        root.right = third;
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        second.left = fourth;
        second.right = fifth;
        int treeHeight = findHeight(root);
        System.out.println("Height of the tree: " + treeHeight);
    }
}
