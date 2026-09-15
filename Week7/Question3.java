//3. Create a BST and perform searching for a given key.
//a. Insert n elements.
//b. Search user-specified value.
//c. Display number of comparisons made
package Week7;
import java.util.*;

public class Question3 {

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

    static int comparisons = 0;

    public static Node insert(Node root, int val) {
        if (root == null) {
            Node newNode = new Node(val);
            return newNode;
        }
        
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        comparisons = comparisons + 1;

        if (root.data == key) {
            return true;
        } else if (key < root.data) {
            boolean result = search(root.left, key);
            return result;
        } else {
            boolean result = search(root.right, key);
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        System.out.print("Enter value to search: ");
        int key = sc.nextInt();

        comparisons = 0;
        boolean found = search(root, key);

        if (found) {
            System.out.println("Element found in the BST.");
        } else {
            System.out.println("Element not found in the BST.");
        }

        System.out.println("Number of comparisons made: " + comparisons);
    }
}
