package series;

public class Day131_2 {

    public static int uniquePaths(int m, int n) {

        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {

            int[] curr = new int[n];

            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    curr[j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                if (i > 0)
                    up = prev[j];

                if (j > 0)
                    left = curr[j - 1];

                curr[j] = up + left;
            }

            prev = curr;
        }

        return prev[n - 1];
    }

    public static void main(String[] args) {

        System.out.println(uniquePaths(3, 7));

    }
}