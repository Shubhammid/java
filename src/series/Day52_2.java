package series;
import java.util.*;

public class Day52_2 {
    public static List<Integer> findAnagramIndices(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        if (text.length() < pattern.length()) {
            return result;
        }
        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];
        for (char c : pattern.toCharArray()) {
            pFreq[c - 'a']++;
        }
        int windowSize = pattern.length();
        for (int i = 0; i < text.length(); i++) {
            windowFreq[text.charAt(i) - 'a']++;
            if (i >= windowSize) {
                windowFreq[text.charAt(i - windowSize) - 'a']--;
            }
            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(i - windowSize + 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next().toLowerCase();
        System.out.print("Enter pattern: ");
        String pattern = sc.next().toLowerCase();
        System.out.println("Anagram indices: " + findAnagramIndices(text, pattern));
    }
}
