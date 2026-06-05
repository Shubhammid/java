package series;

import java.util.*;

public class Day108_1 {

    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] current = intervals[0];
        merged.add(current);

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                current = intervals[i];
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {

        Day108_1 obj = new Day108_1();

        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] result = obj.merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}