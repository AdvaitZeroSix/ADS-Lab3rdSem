//Write a Java program that accepts an arithmetic expression containing the symbols (), {}, and [],
//and determines whether the expression is balanced using a stack.
package Week3;
import java.util.Scanner;
import java.util.Stack;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an arithmetic expression:");
        String string = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean b = true;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='('||string.charAt(i)=='['||string.charAt(i)=='{'){
                stack.push(string.charAt(i));
            }
            else if(string.charAt(i)==')'||string.charAt(i)==']'||string.charAt(i)=='}'){
                if (stack.isEmpty()) {
                    b = false;
                    break;
                }
                char top = stack.pop();
                if(string.charAt(i)==')'&&top!='('||string.charAt(i)==']'&&top!='['||string.charAt(i)=='}'&&top!='{'){
                   b=false;
                   break;
                }
            }
        }
        if(!stack.isEmpty()){
            b=false;
        }
        if(b){
            System.out.print("the given parenthesis are balanced");
        }
        else{
            System.out.print("The given parenthesis are not balanced");
        }
    }
}
