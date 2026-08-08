//1. Write a Java program that accepts a string from the user and reverses it using a stack.
package Week3;
import java.util.Scanner;
import java.util.Stack;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that you want to reverse:");
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}


