package series;

public class Day117_2 {

    public static int largestSmallerThanK(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int k = 7;

        int index = largestSmallerThanK(arr, k);

        if (index != -1) {
            System.out.println("Index: " + index);
            System.out.println("Element: " + arr[index]);
        } else {
            System.out.println("No element smaller than " + k);
        }
    }
}