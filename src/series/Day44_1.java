package series;

public class Day44_1 {
    public static int maxProduct(int[] nums) {
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int tempMax = Math.max(curr,
                    Math.max(maxEndingHere * curr, minEndingHere * curr));
            int tempMin = Math.min(curr,
                    Math.min(maxEndingHere * curr, minEndingHere * curr));
            maxEndingHere = tempMax;
            minEndingHere = tempMin;
            result = Math.max(result, maxEndingHere);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Max Product Subarray: " + maxProduct(nums));
    }
}
