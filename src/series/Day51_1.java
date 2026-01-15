package series;

public class Day51_1 {
    public static void main(String[] args) {
        String s = "aaabbc";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        System.out.println(result.toString());
    }
}
