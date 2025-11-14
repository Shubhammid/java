package series;

import java.util.Scanner;

//Java Program to Find the Largest of three Numbers

public class Day3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("The greater number is: " +num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greater number is: " +num2);
        }else{
            System.out.println("The greater number is: " +num3);
        }
    }
}
