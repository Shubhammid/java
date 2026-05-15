package series;

import java.util.Stack;

public class Day88_1 {
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    static String prefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (isOperator(ch)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = op1 + op2 + ch;
                stack.push(temp);
            } else {
                stack.push(ch + "");
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String prefix = "*+AB-CD";
        String postfix = prefixToPostfix(prefix);
        System.out.println("Prefix Expression  : " + prefix);
        System.out.println("Postfix Expression : " + postfix);
    }
}