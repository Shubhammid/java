package series;

import java.util.*;

public class Day96_1 {
    static class Pair {
        int node;
        int distance;
        Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
    public static int[] dijkstra(int vertices, ArrayList<ArrayList<Pair>> graph, int source) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                (a, b) -> a.distance - b.distance
        );
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        pq.offer(new Pair(source, 0));
        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int currentNode = current.node;
            int currentDistance = current.distance;
            for (Pair neighbor : graph.get(currentNode)) {
                int adjacentNode = neighbor.node;
                int edgeWeight = neighbor.distance;
                if (currentDistance + edgeWeight < distance[adjacentNode]) {
                    distance[adjacentNode] = currentDistance + edgeWeight;
                    pq.offer(new Pair(adjacentNode, distance[adjacentNode]));
                }
            }
        }
        return distance;
    }
    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Pair(1, 2));
        graph.get(1).add(new Pair(0, 2));
        graph.get(0).add(new Pair(2, 4));
        graph.get(2).add(new Pair(0, 4));
        graph.get(1).add(new Pair(2, 1));
        graph.get(2).add(new Pair(1, 1));
        graph.get(1).add(new Pair(3, 7));
        graph.get(3).add(new Pair(1, 7));
        graph.get(2).add(new Pair(4, 3));
        graph.get(4).add(new Pair(2, 3));
        graph.get(3).add(new Pair(4, 1));
        graph.get(4).add(new Pair(3, 1));
        int source = 0;
        int[] shortestDistances = dijkstra(vertices, graph, source);
        System.out.println("Shortest distances from source node " + source + ":");
        for (int i = 0; i < shortestDistances.length; i++) {
            System.out.println("To node " + i + " -> " + shortestDistances[i]);
        }
    }
}