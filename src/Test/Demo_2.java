package Test;

import java.util.Scanner;

//Print all Fibonacci Numbers till N

public class Demo_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number for Fibonacci series");
        int n =scn.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 0; i<=n; i++){
            System.out.print(" " +a);
            int c = a + b;
            a=b;
            b=c;
        }
    }
}
