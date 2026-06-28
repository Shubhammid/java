package series;

import java.util.Arrays;

public class Day128_1 {

    public static int leastSquareNumbers(int k) {

        int[] dp = new int[k + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int i = 1; i <= k; i++) {

            for (int j = 1; j * j <= i; j++) {

                dp[i] = Math.min(dp[i], 1 + dp[i - (j * j)]);
            }
        }

        return dp[k];
    }

    public static void main(String[] args) {

        int k = 12;

        System.out.println(leastSquareNumbers(k));
    }
}