package series;

import java.util.Scanner;

public class Day139_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        boolean isBinary = true;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && digit != 1) {
                isBinary = false;
                break;
            }
            temp /= 10;
        }
        if (isBinary) {
            System.out.println(num + " is a Binary Number.");
        } else {
            System.out.println(num + " is not a Binary Number.");
        }
        sc.close();
    }
}