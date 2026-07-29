package series;

import java.util.Scanner;

public class Day153_1 {

    static String[] ones = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int num) {

        if (num == 0)
            return "Zero";

        if (num < 20)
            return ones[num];

        if (num < 100)
            return tens[num / 10] + " " + ones[num % 10];

        if (num < 1000)
            return ones[num / 100] + " Hundred " + convert(num % 100);

        if (num < 100000)
            return convert(num / 1000) + " Thousand " + convert(num % 1000);

        if (num < 10000000)
            return convert(num / 100000) + " Lakh " + convert(num % 100000);

        return convert(num / 10000000) + " Crore " + convert(num % 10000000);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("In Words: " + convert(num));

        sc.close();
    }
}