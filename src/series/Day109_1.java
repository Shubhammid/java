package series;

import java.util.Arrays;

public class Day109_1 {

    private static final int MOD = 1_000_000_007;

    public int countWays(int[][] ranges) {

        Arrays.sort(ranges, (a, b) -> Integer.compare(a[0], b[0]));

        int groups = 0;

        int end = ranges[0][1];

        for (int i = 1; i < ranges.length; i++) {

            if (ranges[i][0] <= end) {
                end = Math.max(end, ranges[i][1]);
            } else {
                groups++;
                end = ranges[i][1];
            }
        }

        groups++;

        long ans = 1;

        for (int i = 0; i < groups; i++) {
            ans = (ans * 2) % MOD;
        }

        return (int) ans;
    }

    public static void main(String[] args) {

        Day109_1 obj = new Day109_1();

        int[][] ranges = {
                {6, 10},
                {5, 15}
        };

        System.out.println("Number of ways: " + obj.countWays(ranges));
    }
}