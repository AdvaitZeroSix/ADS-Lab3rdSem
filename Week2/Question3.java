//Write a Java program to reverse a given integer using recursion.
package Week2;
import java.util.Scanner;
public class Question3 {
    static void reverse(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
    System.out.print(n % 10);
    reverse(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to reverse:");
        int n =sc.nextInt();
        reverse(n);
    }
}
