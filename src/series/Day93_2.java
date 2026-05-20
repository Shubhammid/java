package series;

import java.util.*;

public class Day93_2 {
    static void findDegree(List<List<Integer>> graph, int vertex) {
        for (int i = 0; i < vertex; i++) {
            int degree = graph.get(i).size();
            System.out.println("Degree of Vertex " + i + " = " + degree);
        }
    }
    public static void main(String[] args) {
        int vertex = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(1).add(0);
        graph.get(0).add(2);
        graph.get(2).add(0);
        graph.get(1).add(2);
        graph.get(2).add(1);
        graph.get(1).add(3);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(4).add(3);
        findDegree(graph, vertex);
    }
}