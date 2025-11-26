package series;

import java.util.Scanner;

//Java Program for Decimal to Binary Conversion

public class Day14_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        int num = sc.nextInt();
        System.out.println("Binary: " + Integer.toBinaryString(num));
    }
}
