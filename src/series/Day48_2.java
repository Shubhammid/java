package series;

public class Day48_2 {
    public static void main(String[] args) {
        String str = "abcdef";
        int k = 2;
        k = k % str.length();
        String rotated = str.substring(k) + str.substring(0, k);
        System.out.println("Left Rotated String: " + rotated);
    }
}
