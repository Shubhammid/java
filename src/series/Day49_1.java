package series;

public class Day49_1 {
    public static char firstUniqueChar(String s) {
        int[] freq = new int[256];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        for (char ch : s.toCharArray()) {
            if (freq[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String s = "leetcode";
        char result = firstUniqueChar(s);
        if (result == '\0') {
            System.out.println("No unique character found");
        } else {
            System.out.println("First unique character: " + result);
        }
    }
}
