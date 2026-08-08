// Write a Java program that accepts a postfix expression consisting of
// single-digit operands and arithmetic operators (+, -, *, /)
// and evaluates the expression using a stack.
package Week3;
import java.util.Scanner;
import java.util.Stack;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a postfix expression:");
        String string = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(ch)) {
                stack.push(Integer.parseInt(String.valueOf(ch)));
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                if (ch == '+') {
                    result = a + b;
                }
                else if (ch == '-') {
                    result = a - b;
                }
                else if (ch == '*') {
                    result = a * b;
                }
                else if (ch == '/') {
                    result = a / b;
                }
                stack.push(result);
            }
        }
        System.out.println("Result: " + stack.pop());
        sc.close();
    }
}
