package series;

public class Day152_2 {

    public static void main(String[] args) {

        int number = 12345;
        int reverse = 0;
        int original = number;
        while (number != 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Original Number : " + original);
        System.out.println("Reversed Number : " + reverse);
    }
}