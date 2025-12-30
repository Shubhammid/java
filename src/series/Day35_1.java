package series;

public class Day35_1 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
