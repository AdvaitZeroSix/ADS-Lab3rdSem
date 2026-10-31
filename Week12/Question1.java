//Given a weighted graph representing cities and connection costs, find the minimum cost required to connect all
//cities
package Week12;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                graph[i][j] = sc.nextInt();
        int[] key = new int[n];
        boolean[] visited = new boolean[n];
        java.util.Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        int cost = 0;
        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++)
                if (!visited[j] && (u == -1 || key[j] < key[u]))
                    u = j;
            visited[u] = true;
            cost += key[u];
            for (int v = 0; v < n; v++)
                if (graph[u][v] != 0 && !visited[v] && graph[u][v] < key[v])key[v] = graph[u][v];
        }
        System.out.println("Minimum Cost: " + cost);
        sc.close();
    }
}
