//Write a Java program to count and display
//the total number of nodes present in a singly linked list.
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
    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
public class Question3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(40);
        list.head.next = new Node(30);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(10);
        System.out.println("Total number of nodes: " + list.countNodes());
    }
}
