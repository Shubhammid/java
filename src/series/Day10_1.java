package series;

//Java Program to Print Pyramid Number Pattern
//      1
//    2 3 2
//  3 4 5 4 3
//4 5 6 7 6 5 4

public class Day10_1 {
    public static void main(String[] args) {
        int r = 4;

        for(int i = 1; i<= r; i++){
            for(int s = 1; s<= r - i; s++){
                System.out.print(" ");
            }

            int num = i;
            for(int j = 1; j<= i; j++){
                System.out.print(num + " ");
                num++;
            }

            num -= 2;
            for(int j = 1; j < i; j++){
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
