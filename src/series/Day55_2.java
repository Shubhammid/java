package series;

public class Day55_2 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return prefix.substring(0, i);
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: "
                + longestCommonPrefix(words));
    }
}
