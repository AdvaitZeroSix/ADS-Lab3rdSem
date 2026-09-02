//1. Write a Java program to implement a Doubly Linked List with the following operations:
//Insert at the beginning.
//Insert at the end.
//Delete a node.
//Display the list in the forward direction.
//Display the list in backward direction.
package Week6;
import java.util.*;
class Node {
    Node prev;
    Node next;
    int data;
    Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
class doubleLinkedList {
    Node head;
    Node tail;
    public void insertFirst(int data) {
        if (head == null) {
            head = new Node(null, data, null);
            tail = head;
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertLast(int data) {
        if (tail == null) {
            tail = new Node(null, data, null);
            head = tail;
        } else {
            Node newNode = new Node(tail, data, null);
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void delete(int data) {
        for (Node n = head; n != null; n = n.next) {
            if (n.data == data) {
                if (head == tail) {
                    head = null;
                    tail = null;
                    return;
                }
                if (n == head) {
                    head = head.next;
                    head.prev = null;
                    return;
                }
                if (n == tail) {
                    tail = tail.prev;
                    tail.next = null;
                    return;
                }
                else {
                    n.prev.next = n.next;
                    n.next.prev = n.prev;
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
    public void displayForward() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            for (Node n = head; n != null; n = n.next) {
                System.out.print(n.data + "->");
            }
            System.out.println();
        }
    }
    public void displayReverse() {
        if (tail == null) {
            System.out.println("Empty");
        } else {
            for (Node n = tail; n != null; n = n.prev) {
                System.out.print(n.data + "->");
            }
            System.out.println();
        }
    }
}
public class Question1 {
public static void main(String[] args) {
    doubleLinkedList list = new doubleLinkedList();
    list.insertFirst(20);
    list.insertLast(30);
    System.out.println("Forward:");
    list.displayForward();
    System.out.println("Reverse:");
    list.displayReverse();
    list.insertLast(40);
    list.delete(30);
    System.out.println("After deleting 30:");
    list.displayForward();
    list.displayReverse();
}

}
