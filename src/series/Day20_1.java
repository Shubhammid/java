package series;

//Java Program to Print Pascal's Triangle

public class Day20_1 {
    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args)
    {
        int n = 4, i, j;
        Day20_1 g = new Day20_1();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(
                        " "
                                + g.factorial(i)
                                / (g.factorial(i - j)
                                * g.factorial(j)));
            }
            System.out.println();
        }
    }
}
