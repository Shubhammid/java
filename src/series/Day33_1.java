package series;

//To find count of each word in string

import java.util.LinkedHashMap;

public class Day33_1 {
    public static void main(String[] args) {
        String s = "java sql java python ";
        String[] sp = s.split(" ");
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        for (String st : sp) {
            if (mp.containsKey(st)) {
                Integer i = mp.get(st);
                mp.put(st, i + 1);
            } else {
                mp.put(st, 1);
            }
        }
        System.out.println(mp);
    }
}
