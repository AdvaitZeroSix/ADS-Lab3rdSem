//Write a Java program to find an element in a 2-D array and display its corresponding 1-D mapped
//index using Row-Major Mapping

package Week1;
import java.util.Scanner;
public class Question6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Enter rows: ");
        r = sc.nextInt();
        System.out.print("Enter columns: ");
        c = sc.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        int found = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == x) {
                    int index = (i * c) + j;
                    System.out.println("Element found at row " + i + " column " + j);
                    System.out.println("1-D Row Major Index = " + index);
                    found = 1;
                    break;
                }
            }
            if (found == 1)
                break;
        }
        if (found == 0) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}