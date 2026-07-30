package series;

import java.util.Scanner;

public class Day154_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int next = num + 1;
        int sqrt = (int) Math.sqrt(next);

        if (sqrt * sqrt == next) {
            System.out.println(num + " is a Sunny Number.");
        } else {
            System.out.println(num + " is NOT a Sunny Number.");
        }

        sc.close();
    }
}