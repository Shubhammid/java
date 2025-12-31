package series;

public class Day36_2 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};

        int candidate = findCandidate(nums);
        if (isMajority(nums, candidate)) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }

    static int findCandidate(int[] nums) {
        int count = 0, candidate = -1;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    static boolean isMajority(int[] nums, int candidate) {
        int count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }
        return count > nums.length / 2;
    }
}
