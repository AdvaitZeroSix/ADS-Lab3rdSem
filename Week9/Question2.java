//. Implement the Brute Force String Matching algorithm. Search for the pattern in the text. Display the
//starting position of the pattern. Count the number of character comparisons
package Week9;
public class Question2 {
    public static void main(String[] args) {
        String text = "AABAACAADAABAABA";
        String pattern = "AABA";
        int comparisons = 0;
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j = 0;
            while (j < pattern.length()) {
                comparisons++;
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
                j++;
            }
            if (j == pattern.length())
                System.out.println("Pattern found at position: " + (i + 1));
        }
        System.out.println("Character comparisons: " + comparisons);
    }
}
