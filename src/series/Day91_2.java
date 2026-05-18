package series;

import java.util.*;

public class Day91_2 {
    public static double[] movingAverage(int[] nums, int k) {
        if (nums.length == 0 || k <= 0) {
            return new double[0];
        }
        int n = nums.length;
        double[] result = new double[n - k + 1];
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        result[0] = (double) windowSum / k;
        for (int i = k; i < n; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            result[i - k + 1] = (double) windowSum / k;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 3;
        double[] averages = movingAverage(arr, k);
        System.out.println("Moving averages:");
        for (double avg : averages) {
            System.out.printf("%.2f ", avg);
        }
    }
}