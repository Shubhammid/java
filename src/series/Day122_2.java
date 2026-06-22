package series;

import java.util.ArrayList;
import java.util.List;

public class Day122_2 {

    public static void combine(int start, int n, int k,
                               List<Integer> current,
                               List<List<Integer>> result) {

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);

            combine(i + 1, n, k, current, result);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int n = 4;
        int k = 2;

        List<List<Integer>> result = new ArrayList<>();

        combine(1, n, k, new ArrayList<>(), result);

        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}