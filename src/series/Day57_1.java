package series;

import java.util.*;

public class Day57_1 {
    public static void main(String[] args) {
        String[] words = {
                "apple","banana","apple","apple","dog",
                "cat","banana","apple","cat","dog"
        };
        Set<String> required = new HashSet<>(
                Arrays.asList("banana", "cat", "dog")
        );
        int[] result = shortestSubarray(words, required);
        if (result[0] == -1) {
            System.out.println("No valid subarray found");
        } else {
            System.out.println("Shortest subarray: " + result[0] + " to " + result[1]);
        }
    }
    static int[] shortestSubarray(String[] words, Set<String> required) {
        Map<String, Integer> freq = new HashMap<>();
        int left = 0, matched = 0;
        int minLen = Integer.MAX_VALUE;
        int start = -1, end = -1;
        for (int right = 0; right < words.length; right++) {
            String word = words[right];
            if (required.contains(word)) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
                if (freq.get(word) == 1) matched++;
            }
            while (matched == required.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                    end = right;
                }
                String leftWord = words[left++];
                if (required.contains(leftWord)) {
                    freq.put(leftWord, freq.get(leftWord) - 1);
                    if (freq.get(leftWord) == 0) matched--;
                }
            }
        }
        return new int[]{start, end};
    }
}
