//Implement Selection Sort. Display the array after each pass. Determine the total number of
//comparisons. Display the sorted array.
package Week9;
import java.util.Arrays;
public class Question3 {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int comparisons = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                comparisons++;
                if (a[j] < a[min])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(a));
        }
        System.out.println("Total comparisons: " + comparisons);
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
