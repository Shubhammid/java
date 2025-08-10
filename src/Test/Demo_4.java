package Test;

import java.util.Scanner;

//Enter the number
//23400
//2
//3
//4
//0
//0

public class Demo_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =scn.nextInt();

        int numberOfDigit = 0;
        int temp = n;
        while(temp!=0){
            temp= temp /10;
            numberOfDigit++;
        }

        int div = (int)Math.pow(10, numberOfDigit - 1);

        while(div != 0){
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }
    }
}
