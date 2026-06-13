package series;

import java.util.Arrays;

public class Day114_1 {

    public static void findKthLargestAndSmallest(int[] arr, int k) {

        Arrays.sort(arr);

        int kthSmallest = arr[k - 1];
        int kthLargest = arr[arr.length - k];

        System.out.println("Kth Smallest Element: " + kthSmallest);
        System.out.println("Kth Largest Element: " + kthLargest);
    }

    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKthLargestAndSmallest(arr, k);
    }
}