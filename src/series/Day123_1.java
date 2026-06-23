package series;

import java.util.ArrayList;
import java.util.List;

public class Day123_1 {

    static void generate(String str, int index, String current, List<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }
        generate(str, index + 1, current + str.charAt(index), result);
        generate(str, index + 1, current, result);
    }

    public static void main(String[] args) {
        String str = "abc";

        List<String> result = new ArrayList<>();
        generate(str, 0, "", result);

        System.out.println(result);
    }
}