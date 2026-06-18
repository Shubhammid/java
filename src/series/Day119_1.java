package series;

import java.util.Arrays;

public class Day119_1 {

    static void permute(int[] arr, int index) {

        if (index == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            swap(arr, index, i);

            permute(arr, index + 1);

            swap(arr, index, i);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        permute(arr, 0);
    }
}