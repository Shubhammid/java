package series;

import java.util.Scanner;

public class Day159_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        if (num.charAt(0) == '0') {
            System.out.println(num + " is not a Duck Number.");
        } else if (num.contains("0")) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is not a Duck Number.");
        }

        sc.close();
    }
}