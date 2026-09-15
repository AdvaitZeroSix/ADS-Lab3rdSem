//2. Write a Java program using a Doubly Linked List to:
//• Visit a webpage.
//• Move to the previous page.
//• Move to the next page.
//• Display the current page.
//Example:
//Google
//YouTube
//Wikipedia
package Week6;

class Node {
    String page;
    Node prev, next;

    Node(String p) {
        page = p;
    }
}

class Browser {
    Node cur;

    void visit(String p) {
        Node n = new Node(p);
        if (cur != null) {
            cur.next = n;
            n.prev = cur;
        }
        cur = n;
    }

    void prev() {
        if (cur != null && cur.prev != null)
            cur = cur.prev;
    }

    void next() {
        if (cur != null && cur.next != null)
            cur = cur.next;
    }

    void display() {
        System.out.println(cur.page);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Browser b = new Browser();

        b.visit("Google");
        b.visit("YouTube");
        b.visit("Wikipedia");

        b.display();

        b.prev();
        b.display();

        b.next();
        b.display();
    }
}
