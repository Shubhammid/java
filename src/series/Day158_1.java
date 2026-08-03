package series;

public class Day158_1 {
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
    static int reverse(int num) {
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        int num = 13;

        int rev = reverse(num);

        if (isPrime(num) && isPrime(rev) && num != rev) {
            System.out.println(num + " is an Emirp Number.");
        } else {
            System.out.println(num + " is NOT an Emirp Number.");
        }
    }
}