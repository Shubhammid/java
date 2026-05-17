package series;

import java.util.Stack;

public class Day90_2 {
    public static String removeInvalidParentheses(String str) {
        Stack<Integer> stack = new Stack<>();
        boolean[] remove = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {

                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    remove[i] = true;
                }
            }
        }
        while (!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!remove[i]) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str1 = "a)b(c)d";
        String str2 = "))((";
        String str3 = "(a(b(c)d)";
        System.out.println("Original: " + str1);
        System.out.println("Valid: " + removeInvalidParentheses(str1));
        System.out.println();
        System.out.println("Original: " + str2);
        System.out.println("Valid: " + removeInvalidParentheses(str2));
        System.out.println();
        System.out.println("Original: " + str3);
        System.out.println("Valid: " + removeInvalidParentheses(str3));
    }
}