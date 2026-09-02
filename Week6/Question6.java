//6. In a multiplayer game, players take turns repeatedly in a circular manner.Write a Java program using
//a Circular Linked List to:
//• Add players.
//• Remove a player.
//• Display the current turn.
//• Move to the next player's turn.
package Week6;
class Node {
    String name;
    Node next;

    Node(String n) {
        name = n;
    }
}
class Game {
    Node tail, cur;
    void add(String n) {
        Node x = new Node(n);

        if (tail == null) {
            tail = cur = x;
            x.next = x;
        } else {
            x.next = tail.next;
            tail.next = x;
            tail = x;
        }
    }
    void remove(String n) {
        if (tail == null)
            return;

        Node p = tail;
        Node x = tail.next;
        do {
            if (x.name.equals(n)) {
                if (x == x.next) {
                    tail = cur = null;
                } else {
                    p.next = x.next;
                    if (x == tail)
                        tail = p;
                    if (x == cur)
                        cur = x.next;
                }
                return;
            }
            p = x;
            x = x.next;
        } while (x != tail.next);
    }
    void turn() {
        if (cur != null)
            System.out.println(cur.name);
    }
    void next() {
        if (cur != null)
            cur = cur.next;
    }
    void display() {
        if (tail == null)
            return;
        Node x = tail.next;
        do {
            System.out.print(x.name + " ");
            x = x.next;
        } while (x != tail.next);
        System.out.println();
    }
}
public class Question6 {
    public static void main(String[] args) {
        Game g = new Game();
        g.add("A");
        g.add("B");
        g.add("C");
        g.display();
        g.turn();
        g.next();
        g.turn();
        g.next();
        g.turn();
        g.remove("B");
        g.display();
        g.next();
        g.turn();
    }
}
