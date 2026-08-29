//4. Write a Java program to traverse a singly linked list and find the maximum element
//stored in the list.
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
    int findMax() {
        int max = head.data;
        Node temp = head.next;
        while (temp != null) {
            if (temp.data > max)
                max = temp.data;
            temp = temp.next;
        }
        return max;
    }
}
public class Question4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(40);
        list.head.next = new Node(70);
        list.head.next.next = new Node(20);
        list.head.next.next.next = new Node(50);
        System.out.println("Maximum element: " + list.findMax());
    }
}
