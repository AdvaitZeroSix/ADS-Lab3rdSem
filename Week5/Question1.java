//Write a Java program to implement a Singly Linked List and insert elements at the beginning.
//Display the resulting list after each insertion.
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
    void insertFirst(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.display();
        
    }
}
