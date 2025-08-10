package Test;

import java.util.Scanner;

//Enter the Lowest number:
//        5
//Enter the Highest number:
//        15
//The Prime Number between 5 and 15 is 5
//The Prime Number between 5 and 15 is 7
//The Prime Number between 5 and 15 is 11
//The Prime Number between 5 and 15 is 13

public class Demo_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Lowest number:");
        int low = scn.nextInt();
        System.out.println("Enter the Highest number:");
        int high = scn.nextInt();

        for(int n= low; n<= high; n++){
            int count = 0;
            for(int div = 2; div*div <= n; div++){
                if(n % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println("The Prime Number between " +low+ " and " +high+ " is " +n);
            }
        }
    }
}
