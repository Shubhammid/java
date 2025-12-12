package series;

//Fibbonacci series for the given number

public class Day30_1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 1; i <= 10; i++){
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
