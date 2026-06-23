package series;

import java.util.ArrayList;
import java.util.List;

public class Day123_2 {

    static void combinationSum(
            int[] arr,
            int index,
            int target,
            List<Integer> current,
            List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        current.add(arr[index]);
        combinationSum(arr, index, target - arr[index], current, result);
        current.remove(current.size() - 1);

        combinationSum(arr, index + 1, target, current, result);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int k = 7;

        List<List<Integer>> result = new ArrayList<>();

        combinationSum(arr, 0, k, new ArrayList<>(), result);

        System.out.println(result);
    }
}