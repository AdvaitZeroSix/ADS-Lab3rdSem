//Write a Java program to reverse a singly linked list without using an
//additional linked list.
package Week5;
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
    void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        System.out.println("Original list:");
        list.display();
        list.reverse();
        System.out.println("Reversed list:");
        list.display();
    }
}

