package series;

public class Day120_1 {

    static void generateBinaryStrings(int n, String current) {

        if (current.length() == n) {
            System.out.println(current);
            return;
        }

        generateBinaryStrings(n, current + "0");
        generateBinaryStrings(n, current + "1");
    }

    public static void main(String[] args) {

        int n = 3;

        generateBinaryStrings(n, "");
    }
}