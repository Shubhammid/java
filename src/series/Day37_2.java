package series;

public class Day37_2 {
    public static void findNumbers(int[] arr) {
        int n = arr.length;
        long sum = 0, squareSum = 0;
        for (int num : arr) {
            sum += num;
            squareSum += (long) num * num;
        }
        long S = (long) n * (n + 1) / 2;
        long S2 = (long) n * (n + 1) * (2 * n + 1) / 6;
        long diff = S - sum;
        long squareDiff = S2 - squareSum;
        long sumXY = squareDiff / diff;
        long missing = (diff + sumXY) / 2;
        long duplicate = sumXY - missing;
        System.out.println("Missing Number: " + missing);
        System.out.println("Duplicate Number: " + duplicate);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        findNumbers(arr);
    }
}
