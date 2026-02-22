package series;

import java.util.*;

public class Day82_1 {

    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    public static void main(String[] args) {

        List<Pair> list = new ArrayList<>();
        list.add(new Pair(3, 5));
        list.add(new Pair(1, 2));
        list.add(new Pair(3, 1));
        list.add(new Pair(2, 4));
        list.add(new Pair(1, 1));

        Collections.sort(list, (a, b) -> {
            if (a.first != b.first) {
                return a.first - b.first;
            }
            return a.second - b.second;
        });

        System.out.println("Sorted Pairs:");
        for (Pair p : list) {
            System.out.println(p);
        }
    }
}