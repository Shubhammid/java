package series;
import java.util.*;

public class Day49_2 {
    public static List<String> repeatedSubstrings(String s, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        if (s.length() < k) return result;
        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            map.put(sub, map.getOrDefault(sub, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "banana";
        int k = 2;
        System.out.println("Repeated substrings: " + repeatedSubstrings(s, k));
    }
}
