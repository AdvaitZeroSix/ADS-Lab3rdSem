//4. Implement Bubble Sort. Display the array after each pass. Determine the total number of
//comparisons. Display the sorted array.
package Week9;
import java.util.Arrays;
public class Question4 {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int comparisons = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                comparisons++;
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(a));
        }
        System.out.println("Total comparisons: " + comparisons);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
