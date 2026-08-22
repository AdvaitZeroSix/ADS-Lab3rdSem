//Write a Java program to implement a Priority Queue. Perform insertion, deletion, and display
//operations, ensuring that elements with higher priority are processed before elements with lower
//priority. Demonstrate the working of the priority queue using suitable test cases.
package Week4;
import java.util.*;
public class Question4 {
    static int[] queue;
    static int[] priority;
    static int size = 0;
    static void insert(int value, int p) {
        if (size == queue.length) {
            System.out.println("Queue Overflow!");
            return;
        }
        queue[size] = value;
        priority[size] = p;
        size++;
        System.out.println("Inserted: " + value + " Priority: " + p);
    }
    static void delete() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return;
        }
        int pos = 0;
        for (int i = 1; i < size; i++) {
            if (priority[i] > priority[pos])
                pos = i;
        }
        System.out.println("Deleted: " + queue[pos]);
        for (int i = pos; i < size - 1; i++) {
            queue[i] = queue[i + 1];
            priority[i] = priority[i + 1];
        }
        size--;
    }
    static void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        for (int i = 0; i < size; i++)
            System.out.println(queue[i] + " - Priority: " + priority[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        queue = new int[sc.nextInt()];
        priority = new int[queue.length];
        int choice;
        do {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    System.out.print("Enter priority: ");
                    int p = sc.nextInt();
                    insert(value, p);
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
