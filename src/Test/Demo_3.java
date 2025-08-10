package Test;

import java.util.Scanner;

//Enter the number
//73047
//5

public class Demo_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =scn.nextInt();

        int digit = 0;

        while(n!=0){
            n = n / 10;
            digit++;
        }
        System.out.println(digit);
    }
}
