//Write a Java program to implement a Circular Queue using an array and perform enqueue,
//dequeue, peek, and display operations. Demonstrate how circular queues overcome the
//limitations of a linear queue by reusing vacant spaces created after deletions
package Week4;
import java.util.*;
public class Question2 {
    static int[] queue;
    static int front = -1, rear = -1;
    static void enqueue(int x) {
        if ((rear + 1) % queue.length == front) {
            System.out.println("Queue Overflow!");
            return;
        }
        if (front == -1)
            front = 0;
        rear = (rear + 1) % queue.length;
        queue[rear] = x;
        System.out.println(x + " inserted");
    }
    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow!");
            return;
        }
        System.out.println(queue[front] + " deleted");
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }
    }
    static void peek() {
        if (front == -1)
            System.out.println("Queue is empty!");
        else
            System.out.println("Front: " + queue[front]);
    }
    static void display() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % queue.length;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        queue = new int[sc.nextInt()];
        int choice;
        do {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    enqueue(sc.nextInt());
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
