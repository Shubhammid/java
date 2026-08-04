package series;

import java.util.Scanner;

public class Day159_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is a Buzz Number.");
        } else {
            System.out.println(num + " is not a Buzz Number.");
        }

        sc.close();
    }
}