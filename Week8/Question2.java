//2. Construct the graph:
//0 → 1,2
//1 → 3
//2 → 3,4
//3 → 5
//4 → 5
//5 → -
//a) Create an adjacency list.
//b) Display all adjacency lists.
//c) Count total vertices and edges.
package Week8;
import java.util.ArrayList;
public class Question2 {
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(2).add(3);
        adjList.get(2).add(4);
        adjList.get(3).add(5);
        adjList.get(4).add(5);
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
        int edges = 0;
        for (int i = 0; i < vertices; i++) {
            edges += adjList.get(i).size();
        }
        System.out.println("\nTotal vertices = " + vertices);
        System.out.println("Total edges = " + edges);
    }
}
