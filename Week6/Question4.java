//4. Write a Java program to implement a Circular Linked List with the following operations:
//• Insert a node.
//• Delete a node.
//• Search for an element.
//• Display all elements.
//• Verify that the last node points back to the first node.
package Week6;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}
class CLL {
    Node tail;
    void insert(int d) {
        Node n = new Node(d);

        if (tail == null) {
            tail = n;
            n.next = n;
        } else {
            n.next = tail.next;
            tail.next = n;
            tail = n;
        }
    }
    void delete(int d) {
        if (tail == null)
            return;
        Node p = tail, n = tail.next;
        do {
            if (n.data == d) {
                if (n == tail && n == tail.next)
                    tail = null;
                else {
                    p.next = n.next;
                    if (n == tail)
                        tail = p;
                }
                return;
            }
            p = n;
            n = n.next;
        } while (n != tail.next);
    }
    void search(int d) {
        if (tail == null)
            return;
        Node n = tail.next;
        do {
            if (n.data == d) {
                System.out.println("Found");
                return;
            }
            n = n.next;
        } while (n != tail.next);

        System.out.println("Not Found");
    }
    void display() {
        if (tail == null)
            return;
        Node n = tail.next;
        do {
            System.out.print(n.data + " ");
            n = n.next;
        } while (n != tail.next);
        System.out.println();
    }
    void verify() {
        if (tail != null && tail.next == getHead())
            System.out.println("Last points to first");
    }
    Node getHead() {
        return tail.next;
    }
}
public class Question4 {
    public static void main(String[] args) {
        CLL l = new CLL();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
        l.search(20);
        l.delete(20);
        l.display();
        l.verify();
    }
}
