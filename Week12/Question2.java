//Given weights and profits of items, maximize the profit without exceeding the knapsack capacity. Items can be
//divided.
package Week12;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] profit = new double[n];
        for (int i = 0; i < n; i++)
            weight[i] = sc.nextDouble();
        for (int i = 0; i < n; i++)
            profit[i] = sc.nextDouble();
        double W = sc.nextDouble();
        double total = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (profit[i] / weight[i] < profit[j] / weight[j]) {
                    double t = profit[i];
                    profit[i] = profit[j];
                    profit[j] = t;
                    t = weight[i];
                    weight[i] = weight[j];
                    weight[j] = t;
                }
        for (int i = 0; i < n && W > 0; i++) {
            double take = Math.min(weight[i], W);
            total += take * profit[i] / weight[i];
            W -= take;
        }
        System.out.println("Maximum Profit: " + total);
        sc.close();
    }
}
