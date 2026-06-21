package series;

import java.util.*;

public class Day121_2 {

    public static void generatePermutations(
            int[][] arrays,
            int index,
            List<Integer> current) {

        if (index == arrays.length) {
            System.out.println(current);
            return;
        }

        for (int num : arrays[index]) {

            current.add(num);

            generatePermutations(
                    arrays,
                    index + 1,
                    current);

            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[][] arrays = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println("All permutations:");

        generatePermutations(
                arrays,
                0,
                new ArrayList<>());
    }
}