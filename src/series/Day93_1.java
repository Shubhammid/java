package series;

import java.util.*;

public class Day93_1 {
    static boolean detectCycle(int vertex, List<List<Integer>> graph) {
        boolean[] visited = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, graph)) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dfs(int current, int parent,
                       boolean[] visited,
                       List<List<Integer>> graph) {
        visited[current] = true;
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {

                if (dfs(neighbor, current, visited, graph)) {
                    return true;
                }

            }
            else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int vertex = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(3).add(1);
        graph.get(1).add(3);

        graph.get(3).add(4);
        graph.get(4).add(3);

        boolean hasCycle = detectCycle(vertex, graph);

        if (hasCycle) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle Found");
        }
    }
}