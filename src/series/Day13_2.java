package series;

import java.util.Scanner;

//Java Program for Hexadecimal to Decimal Conversion

public class Day13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        int decimal = Integer.parseInt(hex, 16);
        System.out.println("Decimal value: " + decimal);
    }
}
