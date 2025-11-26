package series;

import java.util.Scanner;

//Java Program For Decimal to Hexadecimal Conversion

public class Day14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int num = sc.nextInt();
        System.out.println("Hexadecimal: " + Integer.toHexString(num).toUpperCase());
    }
}
