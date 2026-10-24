package Week10;
import java.util.Scanner;
public class Question3 {
    static int min, max;
    static void findMinMax(int[] a, int l, int r) {
        if (l == r) {
            if (a[l] < min) min = a[l];
            if (a[l] > max) max = a[l];
            return;
        }
        int mid = (l + r) / 2;
        findMinMax(a, l, mid);
        findMinMax(a, mid + 1, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        min = max = a[0];
        findMinMax(a, 0, n - 1);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        sc.close();
    }
}
