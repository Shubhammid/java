package series;

public class Day126_2 {

    public static int climbStairs(int n) {

        if (n <= 2)
            return n;

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }

        return second;
    }

    public static void main(String[] args) {

        int n = 5;

        int ways = climbStairs(n);

        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}