package series;

import java.util.*;

public class Day53_2 {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapST.containsKey(c1) && mapST.get(c1) != c2)
                return false;
            if (mapTS.containsKey(c2) && mapTS.get(c2) != c1)
                return false;
            mapST.put(c1, c2);
            mapTS.put(c2, c1);
        }
        return true;
    }
}

