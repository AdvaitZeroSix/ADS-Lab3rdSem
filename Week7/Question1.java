//1. Create a Binary Tree and write a Java program to count:
//a) Total nodes
//b) Leaf nodes
//c) Internal nodes
package Week7;
import java.util.*;

public class Question1 {

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
    public static int countTotal(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftCount = countTotal(root.left);
            int rightCount = countTotal(root.right);
            return 1 + leftCount + rightCount;
        }
    }
    public static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            int leftLeaves = countLeaves(root.left);
            int rightLeaves = countLeaves(root.right);
            return leftLeaves + rightLeaves;
        }
    }
    public static int countInternal(Node root) {
        if (root == null) {
            return 0;
        }        
        if (root.left == null && root.right == null) {
            return 0;
        } else {
            int leftInternal = countInternal(root.left);
            int rightInternal = countInternal(root.right);
            return 1 + leftInternal + rightInternal;
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
        int total = countTotal(root);
        int leaves = countLeaves(root);
        int internals = countInternal(root);
        System.out.println("Total nodes: " + total);
        System.out.println("Leaf nodes: " + leaves);
        System.out.println("Internal nodes: " + internals);
    }
}
