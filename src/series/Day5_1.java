package series;

import java.util.Scanner;

//Java Program to Display All Prime Numbers from 1 to N

public class Day5_1 {

    public static boolean isPrime(int num){
        if(num <= 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of N: ");
        int n = sc.nextInt();

        for(int i = 2; i<= n; i++){
           if(isPrime(i)){
               System.out.println(i + " ");
           }
        }
    }
}
