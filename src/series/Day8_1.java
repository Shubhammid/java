package series;

//Java Program for compound interest

public class Day8_1 {
    public static void main(String[] args) {
        double principal = 1200, rate = 5.4, time = 2;

        double CI = principal * (Math.pow((1 + rate / 100), time));
        System.out.println("Compound Interest " + CI);
    }
}
