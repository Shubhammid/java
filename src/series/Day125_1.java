package series;

import java.util.ArrayList;
import java.util.List;

public class Day125_1 {
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, "", result);
        return result;
    }
    private static void backtrack(String s, int index, int parts,
                                  String current, List<String> result) {
        if (parts == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }
        if (parts == 4 || index == s.length()) {
            return;
        }
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);
            if (segment.length() > 1 && segment.charAt(0) == '0') {
                break;
            }
            int value = Integer.parseInt(segment);
            if (value <= 255) {
                backtrack(s,
                        index + len,
                        parts + 1,
                        current + segment + ".",
                        result);
            }
        }
    }
    public static void main(String[] args) {
        String s = "25525511135";
        List<String> ips = restoreIpAddresses(s);
        System.out.println("Possible IP Addresses:");
        for (String ip : ips) {
            System.out.println(ip);
        }
    }
}