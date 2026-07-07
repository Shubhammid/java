package series;

import java.util.Scanner;

public class Day137_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        int x = sc.nextInt();

        System.out.print("Enter exponent (y): ");
        int y = sc.nextInt();

        int power = 1;

        for (int i = 1; i <= y; i++) {
            power = power * x;
        }

        System.out.println(x + "^" + y + " = " + power);

        sc.close();
    }
}