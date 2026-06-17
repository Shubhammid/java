package series;

public class Day118_1 {

    public static int findMissing(int[] arr) {
        int n = arr.length + 1; // one number is missing

        int expectedSum = (arr[0] + arr[0] + n - 1) * n / 2;

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6};

        int missing = findMissing(arr);

        System.out.println("Missing Number: " + missing);
    }
}