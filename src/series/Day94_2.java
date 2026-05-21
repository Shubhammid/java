package series;

import java.util.*;

public class Day94_2 {
    public static boolean hasPath(int V, ArrayList<ArrayList<Integer>> adj,
                                  int source, int destination) {
        boolean[] visited = new boolean[V];
        return dfs(source, destination, adj, visited);
    }
    public static boolean dfs(int node, int destination,
                              ArrayList<ArrayList<Integer>> adj,
                              boolean[] visited) {
        if (node == destination) {
            return true;
        }
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(3);
        int source = 0;
        int destination = 4;
        System.out.println(hasPath(V, adj, source, destination));
    }
}