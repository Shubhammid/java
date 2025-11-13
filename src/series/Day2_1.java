package series;

//Java Program to Swap Two Numbers

public class Day2_1 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println("Before swapping A = " +a+ " B: " +b);

        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping A = " +a+ " B: " +b);
    }
}
