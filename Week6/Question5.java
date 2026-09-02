package Week6;
class Node {
    String name;
    int time;
    Node next;

    Node(String n, int t) {
        name = n;
        time = t;
    }
}
class RR {
    Node tail;
    void add(String n, int t) {
        Node x = new Node(n, t);
        if (tail == null) {
            tail = x;
            x.next = x;
        } else {
            x.next = tail.next;
            tail.next = x;
            tail = x;
        }
    }
    void run(int q) {
        if (tail == null)
            return;
        Node p = tail;
        Node n = tail.next;
        while (tail != null) {
            System.out.print(n.name + " ");
            n.time -= q;
            if (n.time <= 0) {
                System.out.print("(done) ");
                if (n == n.next) {
                    tail = null;
                    break;
                }
                p.next = n.next;
                if (n == tail)
                    tail = p;
                n = p.next;
            } else {
                p = n;
                n = n.next;
            }
        }
        System.out.println();
    }
}
public class Question5 {
    public static void main(String[] args) {
        RR r = new RR();
        r.add("P1", 5);
        r.add("P2", 3);
        r.add("P3", 7);
        r.run(2);
    }
}
