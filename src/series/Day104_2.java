package series;

import java.util.*;

public class Day104_2 {
    public static Set<String> findDistinctPalindromes(String str) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            expand(str, i, i, palindromes);
            expand(str, i, i + 1, palindromes);
        }
        return palindromes;
    }
    private static void expand(String str,
                               int left,
                               int right,
                               Set<String> palindromes) {
        while (left >= 0 &&
                right < str.length() &&
                str.charAt(left) == str.charAt(right)) {
            palindromes.add(str.substring(left, right + 1));
            left--;
            right++;
        }
    }
    public static void main(String[] args) {
        String str = "abaaa";
        Set<String> result = findDistinctPalindromes(str);
        System.out.println("Distinct Palindromic Substrings:");
        for (String palindrome : result) {
            System.out.println(palindrome);
        }
        System.out.println("Count = " + result.size());
    }
}