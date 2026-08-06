package series;

public class Day161_1 {

    public static void main(String[] args) {

        int num = 145;
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Krishnamurthy Number.");
        } else {
            System.out.println(original + " is not a Krishnamurthy Number.");
        }
    }
}