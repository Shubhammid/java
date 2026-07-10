package series;

import java.util.Scanner;

public class Day139_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 != 0) {
            System.out.println(num + " is an Odd Number.");
        } else {
            System.out.println(num + " is an Even Number.");
        }
        sc.close();
    }
}