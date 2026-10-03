//Write Java programs to solve the following:
//1. Create an undirected graph with the following edges:
//(0,1)
//(0,2)
//(1,3)
//(2,3)
//(3,4)
//a) Create an adjacency matrix.
//b) Display the matrix.
//c) Identify the degree of each vertex.
package Week8;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        int vertices=5;
        int[][] matrix = new int[vertices][vertices];
        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 3},
            {2, 3},
            {3, 4}
        };
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nDegree of each vertex:");
        for (int i = 0; i < vertices; i++) {
            int degree = 0;
            for (int j = 0; j < vertices; j++) {
                degree += matrix[i][j];
            }
            System.out.println("Degree of vertex " + i + " = " + degree);
        }
    }
}
