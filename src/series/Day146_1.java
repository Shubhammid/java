package series;

public class Day146_1 {
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println("Hamming Distance: " + hammingDistance(x, y));
    }
}