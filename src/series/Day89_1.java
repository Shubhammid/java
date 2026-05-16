package series;

import java.util.Stack;

public class Day89_1 {
    public static int evaluate(String expression) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {
                int num = 0;

                while (i < expression.length() &&
                        Character.isDigit(expression.charAt(i))) {

                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }

                values.push(num);
                i--;
            }

            else if (ch == '(') {
                operators.push(ch);
            }

            else if (ch == ')') {

                while (operators.peek() != '(') {
                    values.push(applyOperation(
                            operators.pop(),
                            values.pop(),
                            values.pop()
                    ));
                }

                operators.pop();
            }

            else if (ch == '+' || ch == '-' ||
                    ch == '*' || ch == '/') {

                while (!operators.isEmpty() &&
                        precedence(operators.peek()) >= precedence(ch)) {

                    values.push(applyOperation(
                            operators.pop(),
                            values.pop(),
                            values.pop()
                    ));
                }

                operators.push(ch);
            }
        }

        while (!operators.isEmpty()) {
            values.push(applyOperation(
                    operators.pop(),
                    values.pop(),
                    values.pop()
            ));
        }

        return values.pop();
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }

        if (op == '*' || op == '/') {
            return 2;
        }

        return 0;
    }
    public static int applyOperation(char op, int b, int a) {

        switch (op) {

            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;
        }

        return 0;
    }

    public static void main(String[] args) {

        String expression = "10 + 2 * 6";

        int result = evaluate(expression);

        System.out.println("Expression: " + expression);
        System.out.println("Result: " + result);
    }
}