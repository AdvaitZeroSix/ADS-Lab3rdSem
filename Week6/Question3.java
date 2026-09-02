//3. Write a Java program using a Doubly Linked List to manage a music playlist. The program should:
//• Add songs.
//• Remove songs.
//• Move to the next song.
//• Move to the previous song.
//• Display the current playlist.
package Week6;
class Node {
    String song;
    Node prev, next;

    Node(String s) {
        song = s;
    }
}
class Playlist {
    Node head, tail, cur;
    void add(String s) {
        Node n = new Node(s);
        if (head == null)
            head = tail = cur = n;
        else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }
    void remove(String s) {
        for (Node n = head; n != null; n = n.next) {
            if (n.song.equals(s)) {
                if (n == head)
                    head = n.next;
                else
                    n.prev.next = n.next;
                if (n == tail)
                    tail = n.prev;
                else
                    n.next.prev = n.prev;
                if (cur == n)
                    cur = n.next != null ? n.next : tail;
                return;
            }
        }
    }
    void next() {
        if (cur != null && cur.next != null)
            cur = cur.next;
    }
    void prev() {
        if (cur != null && cur.prev != null)
            cur = cur.prev;
    }
    void current() {
        if (cur != null)
            System.out.println(cur.song);
    }
    void display() {
        for (Node n = head; n != null; n = n.next)
            System.out.print(n.song + " ");
        System.out.println();
    }
}
public class Question3 {
    public static void main(String[] args) {
        Playlist p = new Playlist();
        p.add("Song1");
        p.add("Song2");
        p.add("Song3");
        p.display();
        p.next();
        p.current();
        p.prev();
        p.current();
        p.remove("Song2");
        p.display();
    }
}
