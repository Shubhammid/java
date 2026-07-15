package series;

import java.util.Scanner;

public class Day144_2 {
    public static String base26Encode(int number) {
        if (number <= 0) {
            return "Invalid Input";
        }
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            number--; // Adjust because A starts at 1
            result.append((char) ('A' + (number % 26)));
            number /= 26;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        System.out.println("Base26 Encoding: " + base26Encode(number));
        sc.close();
    }
}