//Write a Java program to find the GCD using Euclid's Recursive Algorithm.
package Week2;
import java.util.Scanner;
public class Question4 {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("GCD = " + gcd(a, b));
        sc.close();
    }
}
