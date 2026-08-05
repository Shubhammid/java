package series;

import java.util.Scanner;

public class Day160_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            if (temp % 2 == 1)
                count++;
            temp /= 2;
        }

        if (count % 2 == 0)
            System.out.println(num + " is an Evil Number.");
        else
            System.out.println(num + " is Not an Evil Number.");

        sc.close();
    }
}