package series;

import java.util.*;

public class Day121_1 {

    public static List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }

    private static List<String> helper(int n, int totalLength) {

        if (n == 0) {
            return Arrays.asList("");
        }

        if (n == 1) {
            return Arrays.asList("0", "1", "8");
        }

        List<String> list = helper(n - 2, totalLength);
        List<String> result = new ArrayList<>();

        for (String middle : list) {

            if (n != totalLength) {
                result.add("0" + middle + "0");
            }

            result.add("1" + middle + "1");
            result.add("6" + middle + "9");
            result.add("8" + middle + "8");
            result.add("9" + middle + "6");
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 3;

        List<String> numbers = findStrobogrammatic(n);

        System.out.println("Strobogrammatic numbers of length " + n + ":");
        System.out.println(numbers);
    }
}