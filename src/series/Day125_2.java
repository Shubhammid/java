package series;

public class Day125_2 {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int prev2 = 1;
        int prev1 = 1;
        for (int i = 2; i <= n; i++) {
            int current = 0;
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            if (oneDigit >= 1) {
                current += prev1;
            }
            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                current += prev2;
            }
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) {
        String s = "226";
        int ways = numDecodings(s);
        System.out.println("Number of Decodings: " + ways);
    }
}