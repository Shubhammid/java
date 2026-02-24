package series;

public class Day83_2 {
    public static int findX(int[] arr, int K) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return K - sum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        int K = 20;
        int x = findX(arr, K);
        System.out.println("Value of X to make array sum = K: " + x);
    }
}