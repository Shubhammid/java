package series;

import java.util.Scanner;

//Java Program to Check if a Given Integer is Odd or Even

public class Day3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
