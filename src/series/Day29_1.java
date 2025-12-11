package series;

//To find the product of the digits in a given number

public class Day29_1 {
    public static void main(String[] args) {
        int num = 153;
        int res = 1;
        int rem = 0;
        while (num > 0){
            rem = num % 10;
            res = res * rem;
            num = num / 10;
        }
        System.out.println("Product of digits: " + res);
    }
}
