//Write a Java program to insert a new node after a specified value in a
//singly linked list.
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

    void insertAfter(int value, int data) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Value not found");
    }

    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList list = new LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Original list:");
        list.display();

        System.out.print("Enter value after which to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter new element: ");
        int data = sc.nextInt();

        list.insertAfter(value, data);

        System.out.println("Updated list:");
        list.display();

        sc.close();
    }
}
