package series;

//Java Program to Find the LCM of Two Numbers

public class Day4_1 {
    public static void main(String[] args) {
        int a = 13, b = 34;
        int ans = (a > b) ? a : b;
        while(true){
            if(ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }
        System.out.println("LCM of " +a+ " and " +b+ " = " +ans);
    }
}
