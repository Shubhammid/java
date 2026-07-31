package series;

import java.util.ArrayList;
import java.util.Scanner;

public class Day155_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String str = Integer.toString(num);

        int digits = str.length();

        ArrayList<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < digits; i++) {
            sequence.add(str.charAt(i) - '0');
        }

        int next = 0;

        while (next < num) {

            next = 0;

            for (int i = sequence.size() - digits; i < sequence.size(); i++) {
                next += sequence.get(i);
            }

            sequence.add(next);
        }

        if (next == num) {
            System.out.println(num + " is a Keith Number.");
        } else {
            System.out.println(num + " is Not a Keith Number.");
        }
    }
}