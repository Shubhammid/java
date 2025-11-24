package series;

import java.util.Scanner;

//Java Program to Convert Binary to Octal

public class Day12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary Number");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number: " + octal);
    }
}
