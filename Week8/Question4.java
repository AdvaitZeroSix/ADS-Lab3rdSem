//4. Cities are represented as graph vertices.
//Mangalore → Udupi, Manipal
//Udupi → Kundapura
//Manipal → Karkala
//Kundapura → -
//Karkala → -
//a) Create the graph using adjacency lists.
//b) Perform BFS traversal from Mangalore.
//c) Perform DFS traversal from Mangalore.
//d) Compare the traversal orders obtained from BFS and DFS.
package Week8;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Question4 {
    static ArrayList<ArrayList<String>> graph = new ArrayList<>();
    static String[] cities = {
        "Mangalore",
        "Udupi",
        "Manipal",
        "Kundapura",
        "Karkala"
    };
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add("Udupi");
        graph.get(0).add("Manipal");
        graph.get(1).add("Kundapura");
        graph.get(2).add("Karkala");
        System.out.println("Adjacency List:");
        for (int i = 0; i < 5; i++) {
            System.out.print(cities[i] + " -> ");
            for (String neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
        System.out.print("\nBFS Traversal from Mangalore: ");
        bfs("Mangalore");
        System.out.print("\nDFS Traversal from Mangalore: ");

        boolean[] visited = new boolean[5];

        dfs("Mangalore", visited);

        System.out.println();
        System.out.println("\nComparison:");
        System.out.println("BFS visits the graph level by level.");
        System.out.println("DFS goes as deep as possible before backtracking.");
    }
    static void bfs(String start) {

        boolean[] visited = new boolean[5];

        Queue<String> queue = new LinkedList<>();

        queue.add(start);

        visited[getIndex(start)] = true;

        while (!queue.isEmpty()) {

            String current = queue.remove();

            System.out.print(current + " ");

            int index = getIndex(current);

            for (String neighbor : graph.get(index)) {

                int neighborIndex = getIndex(neighbor);

                if (!visited[neighborIndex]) {

                    visited[neighborIndex] = true;

                    queue.add(neighbor);
                }
            }
        }
    }
    static void dfs(String current, boolean[] visited) {
        int index = getIndex(current);
        visited[index] = true;
        System.out.print(current + " ");
        for (String neighbor : graph.get(index)) {
            int neighborIndex = getIndex(neighbor);
            if (!visited[neighborIndex]) {
                dfs(neighbor, visited);
            }
        }
    }
    static int getIndex(String city) {
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].equals(city)) {
                return i;
            }
        }
        return -1;
    }
}
