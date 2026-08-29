//Write a Java program to search for a given element in a singly linked list and display whether it is
//found or not.
package Week5;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    boolean search(int data) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }

        return false;
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.print("Enter element to search: ");
        int value = sc.nextInt();

        if (list.search(value))
            System.out.println("Element found");
        else
            System.out.println("Element not found");

        sc.close();
    }
}
