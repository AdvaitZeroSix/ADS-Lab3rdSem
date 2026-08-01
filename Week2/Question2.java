//Write a Java program to find the sum of digits of a given number using recursion
package Week2;
import java.util.Scanner;
public class Question2 {
    static int sumofdigits(int n){
        if(n<10){
            return n;
        }
        return(sumofdigits((n-(n%10))/10)+(n%10));
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdigits(n));
    }
}
