package series;

import java.util.Scanner;

public class Day155_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = "" + num + (num * 2) + (num * 3);

        if (result.length() != 9) {
            System.out.println(num + " is Not a Fascinating Number.");
            return;
        }

        int[] count = new int[10];

        for (int i = 0; i < result.length(); i++) {

            int digit = result.charAt(i) - '0';

            if (digit == 0) {
                System.out.println(num + " is Not a Fascinating Number.");
                return;
            }

            count[digit]++;
        }

        for (int i = 1; i <= 9; i++) {

            if (count[i] != 1) {
                System.out.println(num + " is Not a Fascinating Number.");
                return;
            }
        }

        System.out.println(num + " is a Fascinating Number.");
    }
}