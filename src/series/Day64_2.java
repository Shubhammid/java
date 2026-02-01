package series;

import java.util.*;

public class Day64_2 {
    static class Node {
        int value;
        int arrayIndex;
        int elementIndex;

        Node(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static void main(String[] args) {

        int[][] lists = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        List<Integer> result = mergeKLists(lists);
        System.out.println(result);
    }

    static List<Integer> mergeKLists(int[][] lists) {

        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> a.value - b.value
        );

        // add first element of each list
        for (int i = 0; i < lists.length; i++) {
            if (lists[i].length > 0) {
                pq.add(new Node(lists[i][0], i, 0));
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            result.add(curr.value);

            int nextIndex = curr.elementIndex + 1;
            if (nextIndex < lists[curr.arrayIndex].length) {
                pq.add(new Node(
                        lists[curr.arrayIndex][nextIndex],
                        curr.arrayIndex,
                        nextIndex
                ));
            }
        }

        return result;
    }
}
