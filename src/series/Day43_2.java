package series;

public class Day43_2 {
    public static int maxSumSubarrayK(int[] arr, int k) {
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - (k - 1)];
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max Subarray Sum of size K: " + maxSumSubarrayK(arr, k));
    }
}
