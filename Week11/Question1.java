//Given a set of items, each having a weight and profit, determine the maximum profit that can
//be obtained without exceeding the knapsack capacity.
package Week11;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] profit = new int[n];
        for (int i = 0; i < n; i++)
            weight[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            profit[i] = sc.nextInt();
        int W = sc.nextInt();
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (weight[i - 1] <= w)
                    dp[i][w] = Math.max(
                        profit[i - 1] + dp[i - 1][w - weight[i - 1]],
                        dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }
        System.out.println("Maximum Profit: " + dp[n][W]);
        sc.close();
    }
}
