package series;

public class Day57_2 {
    public static void main(String[] args) {
        String[] words = {"Shubham", "Midgule", "likes", "to", "code"};
        int maxWidth = 10;
        wordWrap(words, maxWidth);
    }
    static void wordWrap(String[] words, int maxWidth) {
        int n = words.length;
        int[] dp = new int[n + 1];
        int[] path = new int[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            int len = -1;
            dp[i] = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                len += words[j].length() + 1;
                if (len > maxWidth) break;
                int cost = (j == n - 1) ? 0 :
                        (maxWidth - len) * (maxWidth - len) + dp[j + 1];
                if (cost < dp[i]) {
                    dp[i] = cost;
                    path[i] = j + 1;
                }
            }
        }
        int i = 0;
        while (i < n) {
            int j = path[i];
            for (int k = i; k < j; k++) {
                System.out.print(words[k] + " ");
            }
            System.out.println();
            i = j;
        }
    }
}
