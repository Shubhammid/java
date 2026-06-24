package series;

import java.util.*;

public class Day124_2 {

    public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        String[] map = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        backtrack(digits, 0, new StringBuilder(), result, map);

        return result;
    }

    private static void backtrack(String digits,
                                  int index,
                                  StringBuilder current,
                                  List<String> result,
                                  String[] map) {

        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            current.append(ch);

            backtrack(digits, index + 1, current, result, map);

            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {

        String digits = "23";

        List<String> ans = letterCombinations(digits);

        System.out.println("Letter Combinations:");
        System.out.println(ans);
    }
}