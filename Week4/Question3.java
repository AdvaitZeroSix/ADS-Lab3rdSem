//Write a Java program to implement a Double-Ended Queue (Deque) using an array. The program
//should support the following operations:
//• Insert an element at the front of the deque.
//• Insert an element at the rear of the deque.
//• Delete an element from the front of the deque.
//• Delete an element from the rear of the deque.
//• Display all elements present in the deque.
//• Handle Overflow and Underflow conditions
package Week4;
import java.util.*;
public class Question3 {
    static int[] deque;
    static int front = -1, rear = -1;
    static void insertFront(int x) {
        if ((rear + 1) % deque.length == front) {
            System.out.println("Overflow!");
            return;
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            front = (front - 1 + deque.length) % deque.length;
        }
        deque[front] = x;
    }
    static void insertRear(int x) {
        if ((rear + 1) % deque.length == front) {
            System.out.println("Overflow!");
            return;
        }
        if (rear == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % deque.length;
        }
        deque[rear] = x;
    }
    static void deleteFront() {
        if (front == -1) {
            System.out.println("Underflow!");
            return;
        }
        System.out.println("Deleted: " + deque[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % deque.length;
        }
    }
    static void deleteRear() {
        if (front == -1) {
            System.out.println("Underflow!");
            return;
        }
        System.out.println("Deleted: " + deque[rear]);
        if (front == rear) {
            front = rear = -1;
        } else {
            rear = (rear - 1 + deque.length) % deque.length;
        }
    }
    static void display() {
        if (front == -1) {
            System.out.println("Deque is empty!");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(deque[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % deque.length;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deque size: ");
        deque = new int[sc.nextInt()];
        int choice;
        do {
            System.out.println("\n1. Insert Front");
            System.out.println("2. Insert Rear");
            System.out.println("3. Delete Front");
            System.out.println("4. Delete Rear");
            System.out.println("5. Display");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    insertFront(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    insertRear(sc.nextInt());
                    break;
                case 3:
                    deleteFront();
                    break;
                case 4:
                    deleteRear();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        sc.close();
    }
}
