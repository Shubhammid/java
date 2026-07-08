package series;

import java.util.Scanner;

public class Day138_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        if (num >= 0) {
            double squareRoot = Math.sqrt(num);
            System.out.println("Square root of " + num + " = " + squareRoot);
        } else {
            System.out.println("Square root of a negative number is not possible.");
        }
        sc.close();
    }
}