package series;

public class Day118_2 {

    public static int findMissingAP(int[] arr) {

        int diff = Math.min(arr[1] - arr[0], arr[2] - arr[1]);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i + 1] - arr[i] != diff) {
                return arr[i] + diff;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 10, 12};

        int missing = findMissingAP(arr);

        System.out.println("Missing Number in AP: " + missing);
    }
}