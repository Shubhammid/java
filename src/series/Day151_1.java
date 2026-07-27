package series;

public class Day151_1 {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length();
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number.");
        }
    }
}