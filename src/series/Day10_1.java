package series;

//Java Program to Print Pyramid Number Pattern

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
