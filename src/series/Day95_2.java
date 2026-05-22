package series;

import java.util.*;

public class Day95_2 {
    static class Edge {
        int src;
        int dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 5));
    }
    public static void shortestPath(ArrayList<Edge>[] graph,
                                    int src, int target, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[V];
        int[] parent = new int[V];
        Arrays.fill(parent, -1);
        q.add(src);
        vis[src] = true;
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (curr == target) {
                break;
            }
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    vis[e.dest] = true;
                    parent[e.dest] = curr;
                    q.add(e.dest);
                }
            }
        }
        ArrayList<Integer> path = new ArrayList<>();
        int current = target;
        while (current != -1) {
            path.add(current);
            current = parent[current];
        }
        Collections.reverse(path);
        System.out.println("Shortest Path:");
        for (int node : path) {
            System.out.print(node + " ");
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int target = 5;
        shortestPath(graph, src, target, V);
    }
}