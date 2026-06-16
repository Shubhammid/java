package series;

public class Day117_1 {

    public static int firstLargerThanK(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int k = 7;

        int index = firstLargerThanK(arr, k);

        if (index != -1) {
            System.out.println("Index: " + index);
            System.out.println("Element: " + arr[index]);
        } else {
            System.out.println("No element larger than " + k);
        }
    }
}