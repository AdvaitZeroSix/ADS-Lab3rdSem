//3. Given the graph:
//A → B, C
//B → D, E
//C → F
//D → -
//E → F
//F → -
//Represent the graph using an adjacency list and perform:
//a) BFS traversal starting from A
//b) DFS traversal starting from A
package Week8;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Question3 {
    static ArrayList<ArrayList<Character>> graph = new ArrayList<>();
    static char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F'};
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add('B');
        graph.get(0).add('C');
        graph.get(1).add('D');
        graph.get(1).add('E');
        graph.get(2).add('F');
        graph.get(4).add('F');
        System.out.println("Adjacency List:");
        for (int i = 0; i < 6; i++) {
            System.out.print(vertices[i] + " -> ");
            for (char neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }
        System.out.print("\nBFS Traversal starting from A: ");
        bfs('A');
        System.out.print("\nDFS Traversal starting from A: ");
        boolean[] visited = new boolean[6];
        dfs('A', visited);
        System.out.println();
    }
    static void bfs(char start) {
        boolean[] visited = new boolean[6];
        Queue<Character> queue = new LinkedList<>();
        queue.add(start);
        visited[start - 'A'] = true;
        while (!queue.isEmpty()) {
            char current = queue.remove();
            System.out.print(current + " ");
            int index = current - 'A';
            for (char neighbor : graph.get(index)) {
                if (!visited[neighbor - 'A']) {
                    visited[neighbor - 'A'] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
    static void dfs(char current, boolean[] visited) {
        visited[current - 'A'] = true;
        System.out.print(current + " ");
        int index = current - 'A';
        for (char neighbor : graph.get(index)) {
            if (!visited[neighbor - 'A']) {
                dfs(neighbor, visited);
            }
        }
    }
}
