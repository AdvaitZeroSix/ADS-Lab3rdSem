//1)Write a Java program to implement a Queue using an array and demonstrate its application in a
//Printer Job Scheduling System. In the printer system, print jobs are processed in the order they are
//received (FIFO).
//The program should support the following operations:
//• Add a print job to the queue (Enqueue).
//• Process a print job (Dequeue).
//• Display the next print job to be processed.
//• Display all print jobs currently waiting in the queue.
//• Handle Queue Overflow and Queue Underflow conditions
package Week4;
import java.util.*;
public class Question1 {
    static String[] queue;
    static int end=-1;
    static int start=0;
    static void enqueue(String str){
        if(end==queue.length-1){
            System.out.println("Queue Overflow!");
            return;
        }
        else{
            end=end+1;
            queue[end]=str;
        }
    }
    static void dequeue(){
       if(end==-1){
           System.out.println("Queue underflow");
           return;
       } 
       else{
           System.out.println(queue[start]);
           for(int i=start+1;i<=end;i++){
               queue[i-1]=queue[i];
           }
           end=end-1;
       }
    }
    static void peek(){
        if(end==-1){
            System.out.println("Nothing to peek");
            return;
        }
        System.out.println(queue[start]);
    }
    static void display(){
        if(end==-1){
        System.out.println("Nothing to Display");
        return;
        }
        for(int i=0;i<=end;i++){
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue:");
        queue = new String[sc.nextInt()];
        int choice;
        do{
            System.out.println("1.Enqueue\n2.Dequeue\n3.Peek\n4.Display\n5.Exit\nEnter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    enqueue(sc.nextLine());
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
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice!=5);
        sc.close();
    }
}
