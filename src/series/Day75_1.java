package series;

import java.util.Scanner;

public class Day75_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);

        while (num > 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }

        sc.close();
    }
}
