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
    void deleteElement(int data) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            if (curr.data == data) {
                if (prev == null)
                    head = head.next;
                else
                    prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Element not found");
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.head = new Node(40);
        list.head.next = new Node(30);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(10);
        System.out.println("Original list:");
        list.display();
        System.out.print("Enter element to delete: ");
        list.deleteElement(sc.nextInt());
        System.out.println("Updated list:");
        list.display();
        sc.close();
    }
}
