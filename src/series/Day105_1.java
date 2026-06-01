package series;

import java.util.Arrays;

public class Day105_1 {

    public static String longestRepeatedSubstring(String str) {
        int n = str.length();

        String[] suffixes = new String[n];

        for (int i = 0; i < n; i++) {
            suffixes[i] = str.substring(i);
        }

        Arrays.sort(suffixes);

        String longest = "";

        for (int i = 0; i < n - 1; i++) {
            String lcp = longestCommonPrefix(suffixes[i], suffixes[i + 1]);

            if (lcp.length() > longest.length()) {
                longest = lcp;
            }
        }

        return longest;
    }

    private static String longestCommonPrefix(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        int i = 0;

        while (i < len && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }

        return s1.substring(0, i);
    }

    public static void main(String[] args) {
        String str = "banana";
        System.out.println("Longest Repeated Substring: "
                + longestRepeatedSubstring(str));
    }
}