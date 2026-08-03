package series;

public class Day158_2 {

    static boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int num = 30;
        int temp = num;
        int count = 0;

        for (int i = 2; i <= temp; i++) {

            if (isPrime(i) && temp % i == 0) {

                count++;

                temp /= i;

                if (temp % i == 0) {
                    count = -100;
                    break;
                }
            }
        }

        if (count == 3 && temp == 1) {
            System.out.println(num + " is a Sphenic Number.");
        } else {
            System.out.println(num + " is NOT a Sphenic Number.");
        }
    }
}