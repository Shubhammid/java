package series;

import java.util.Scanner;

public class Day153_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;

        while (temp > 0) {

            if ((temp % 10) != (square % 10)) {
                System.out.println(num + " is NOT an Automorphic Number.");
                sc.close();
                return;
            }

            temp /= 10;
            square /= 10;
        }

        System.out.println(num + " is an Automorphic Number.");

        sc.close();
    }
}