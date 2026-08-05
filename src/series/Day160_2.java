package series;

import java.util.Scanner;

public class Day160_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 10-digit ISBN number: ");
        String isbn = sc.nextLine();

        if (isbn.length() != 10) {
            System.out.println("Invalid ISBN Number");
        } else {

            int sum = 0;

            for (int i = 0; i < 10; i++) {

                char ch = isbn.charAt(i);

                if (!Character.isDigit(ch)) {
                    System.out.println("Invalid ISBN Number");
                    sc.close();
                    return;
                }

                int digit = ch - '0';
                sum += digit * (i + 1);
            }

            if (sum % 11 == 0)
                System.out.println("Valid ISBN Number");
            else
                System.out.println("Invalid ISBN Number");
        }

        sc.close();
    }
}