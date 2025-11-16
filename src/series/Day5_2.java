package series;

import java.util.Scanner;

//Java Program to Find if a Given Year is a Leap Year

public class Day5_2 {
    public static  boolean isLeapYear(int year){
        if(year % 400  == 0){
            return true;
        }
        else if(year % 100  == 0){
            return false;
        }
        else if(year % 4  == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if(isLeapYear(year)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }

    }
}
