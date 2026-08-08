// Write a Java program that accepts an infix expression and converts it into an equivalent postfix
// expression using stack operations while considering operator precedence and associativity
package Week3;
import java.util.Scanner;
import java.util.Stack;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an infix expression:");
        String string = sc.nextLine();
        String output = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                output = output + ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output = output + stack.pop();
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!stack.isEmpty() && stack.peek() != '(' && precedence(stack.peek()) >= precedence(ch)) {
                    output = output + stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            output = output + stack.pop();
        }
        System.out.println("Postfix expression: " + output);
        sc.close();
    }
    public static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        }
        if (ch == '*' || ch == '/') {
            return 2;
        }
        return 0;
    }
}
