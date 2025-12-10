package series;

//To check the given number is Armstrong number

public class Day28_1 {
    public static void main(String[] args) {
        int num  = 153;
        int n = num;
        int res = 0;
        int rem = 0;
        while (num > 0){
            rem = num % 10;
            res = res + (rem * rem * rem);
            num = num / 10;
        }
        if(n == res){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
