package series;

public class Day120_2 {

    static void generateParentheses(
            int open,
            int close,
            int n,
            String current) {

        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }

        if (open < n) {
            generateParentheses(
                    open + 1,
                    close,
                    n,
                    current + "(");
        }

        if (close < open) {
            generateParentheses(
                    open,
                    close + 1,
                    n,
                    current + ")");
        }
    }

    public static void main(String[] args) {

        int n = 3;

        generateParentheses(0, 0, n, "");
    }
}