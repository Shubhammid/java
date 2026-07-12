package series;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day141_2 {
    public static boolean isStrobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        int left = 0;
        int right = num.length() - 1;
        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);
            if (!map.containsKey(leftChar) || map.get(leftChar) != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        if (isStrobogrammatic(num)) {
            System.out.println("Strobogrammatic Number");
        } else {
            System.out.println("Not a Strobogrammatic Number");
        }
        sc.close();
    }
}