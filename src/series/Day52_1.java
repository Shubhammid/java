package series;
import java.util.Scanner;

public class Day52_1 {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next().toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.next().toLowerCase();
        System.out.println(isAnagram(s1, s2) ? "Anagram" : "Not Anagram");
    }
}
