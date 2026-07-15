package series;

import java.util.Scanner;

public class Day144_1 {
    public static String decimalToBaseN(int number, int base) {
        if (base < 2 || base > 36) {
            return "Invalid Base";
        }
        if (number == 0) {
            return "0";
        }
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            result.append(digits.charAt(remainder));
            number /= base;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int number = sc.nextInt();
        System.out.print("Enter Base (2-36): ");
        int base = sc.nextInt();
        System.out.println("Result: " + decimalToBaseN(number, base));
        sc.close();
    }
}