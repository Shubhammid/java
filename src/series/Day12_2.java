package series;

import java.util.Scanner;

//Java Program to Convert Octal to Decimal

public class Day12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Octal Number");
        String octal = sc.nextLine();

        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Octal number: " + decimal);
    }
}
