package series;

import java.util.Scanner;

//Java Program For Decimal to Octal Conversion

public class Day13_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal representation: " + octal);
    }
}
