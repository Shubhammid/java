package series;

//To check the given number is prime or not

public class Day34_1 {
    public static void main(String[] args) {
        int flag = 0;
        int n = 1;
        if (n == 0 || n == 1) {
            System.out.println("0 and 1 not considered as prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Given number is prime");

            } else {
                System.out.println("Not prime");
            }
        }
    }
}
