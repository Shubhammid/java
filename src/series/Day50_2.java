package series;

import java.util.Scanner;

public class Day50_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();
        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();
        System.out.println(canConstruct(ransomNote, magazine));
    }
    static boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }
}
