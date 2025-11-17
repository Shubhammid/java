package series;

//Java Program to Check Armstrong Number between Two Integers

public class Day6_1 {
    static void ArmstrongNum(int l, int h){
        for(int j = l + 1; j < h; j++){
            int y = j;
            int N = 0;
            while (y != 0){
                y /= 10;
                N++;
            }
            int sum_power = 0;
            y = j;
            while (y != 0){
                int d = y % 10;
                sum_power += Math.pow(d, N);
                y /= 10;
            }
            if(sum_power == j)
                System.out.println(j + " ");
        }
    }
    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 500;
        ArmstrongNum(n1, n2);
        System.out.println();
    }
}
