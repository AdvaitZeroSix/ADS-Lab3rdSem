//5. Using BST:
//a. Find smallest element.
//b. Find largest element.
//c. Display path traversed to reach both nodes.

package Week7;
import java.util.*;

public class Question5 {

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

    public static void findSmallest(Node root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        ArrayList<Integer> path = new ArrayList<>();
        Node current = root;

        while (current != null) {
            path.add(current.data);
            if (current.left != null) {
                current = current.left;
            } else {
                break;
            }
        }

        System.out.print("Smallest element: ");
        if (!path.isEmpty()) {
            System.out.println(path.get(path.size() - 1));
        }

        System.out.print("Path traversed: ");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void findLargest(Node root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        ArrayList<Integer> path = new ArrayList<>();
        Node current = root;

        while (current != null) {
            path.add(current.data);
            if (current.right != null) {
                current = current.right;
            } else {
                break;
            }
        }

        System.out.print("Largest element: ");
        if (!path.isEmpty()) {
            System.out.println(path.get(path.size() - 1));
        }

        System.out.print("Path traversed: ");
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
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

        findSmallest(root);
        findLargest(root);
    }
}
