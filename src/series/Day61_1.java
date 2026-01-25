package series;

public class Day61_1 {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = (result + k) % i;
        }
        System.out.println("Last man standing is: " + (result + 1));
    }
}
