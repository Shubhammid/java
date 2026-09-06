package series;

import java.util.Arrays;

public class Day163_1 {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Copied Array:   " + Arrays.toString(arr2));
    }
}