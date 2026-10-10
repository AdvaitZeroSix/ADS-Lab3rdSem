//1. Implement Linear Search. Search for the element 60. Display the position of the element. Determine
//the number of comparisons performed.
package Week9;
public class Question1 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
        int comparisons = 0, key = 60;
        for (int i = 0; i < a.length; i++) {
            comparisons++;
            if (a[i] == key) {
                System.out.println("Position: " + (i + 1));
                System.out.println("Comparisons: " + comparisons);
                return;
            }
        }
        System.out.println("Element not found");
        System.out.println("Comparisons: " + comparisons);
    }
}
