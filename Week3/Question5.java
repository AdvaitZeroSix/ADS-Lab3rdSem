//Write a Java program that accepts a decimal number from the user and converts it into its binary
//representation using a stack.
package Week3;
import java.util.Scanner;
import java.util.Stack;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        if (a == 0) {
            System.out.print("0");
        }
        while(a>=1){
            stack.push(a%2);
            a=a/2;
        }
        System.out.println("The number in binary:");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
