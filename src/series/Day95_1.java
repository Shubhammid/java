package series;

import java.util.ArrayList;

public class Day95_1 {
    static class Edge {
        int src;
        int dest;
        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void printAllPaths(ArrayList<Edge>[] graph, int curr,
                                     boolean[] vis, String path, int target) {
        if (curr == target) {
            System.out.println(path);
            return;
        }
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                printAllPaths(graph, e.dest, vis,
                        path + " -> " + e.dest, target);
            }
        }
        vis[curr] = false;
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
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        int target = 4;
        boolean[] vis = new boolean[V];
        System.out.println("All paths from source to destination:");
        printAllPaths(graph, src, vis, "0", target);
    }
}