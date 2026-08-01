package Week1;
import java.util.Scanner;
public class Question5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Enter rows: ");
        r = sc.nextInt();
        System.out.print("Enter columns: ");
        c = sc.nextInt();
        int a[][] = new int[r][c];
        int zero = 0;
        int nonzero = 0;
        System.out.println("Enter matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 0)
                    zero++;
                else
                    nonzero++;
            }
        }
        if (zero > nonzero)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not a Sparse Matrix");
        int b[] = new int[nonzero * 3];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != 0) {
                    b[k] = i;
                    k++;
                    b[k] = j;
                    k++;
                    b[k] = a[i][j];
                    k++;
                }
            }
        }
        System.out.println("Row Column Value");
        for (int i = 0; i < b.length; i = i + 3) {
            System.out.println(b[i] + " " + b[i + 1] + " " + b[i + 2]);
        }
        sc.close();
    }
}
