package series;

import java.util.Scanner;

public class Day138_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        if (num > 0) {
            double logBase2 = Math.log(num) / Math.log(2);
            System.out.println("Log base 2 of " + num + " = " + logBase2);
        } else {
            System.out.println("Logarithm is not defined for zero or negative numbers.");
        }
        sc.close();
    }
}