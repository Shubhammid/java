package series;

import java.util.*;

public class Day96_2 {
    public static void dfs(int node,
                           ArrayList<ArrayList<Integer>> graph,
                           boolean[] visited,
                           Stack<Integer> stack) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, stack);
            }
        }
        stack.push(node);
    }
    public static List<Integer> topologicalSort(int vertices,
                                                ArrayList<ArrayList<Integer>> graph) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, stack);
            }
        }
        List<Integer> topoOrder = new ArrayList<>();
        while (!stack.isEmpty()) {
            topoOrder.add(stack.pop());
        }
        return topoOrder;
    }
    public static void main(String[] args) {
        int vertices = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);
        List<Integer> result = topologicalSort(vertices, graph);
        System.out.println("Topological Sort Order:");
        for (int node : result) {
            System.out.print(node + " ");
        }
    }
}