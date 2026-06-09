package series;

import java.util.Arrays;

public class Day111_1 {

    public static int[] nearestStoreDistance(int[] arr) {
        int n = arr.length;
        int[] dist = new int[n];

        Arrays.fill(dist, Integer.MAX_VALUE);

        int lastStore = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                lastStore = i;
                dist[i] = 0;
            } else if (lastStore != -1) {
                dist[i] = i - lastStore;
            }
        }

        lastStore = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                lastStore = i;
            } else if (lastStore != -1) {
                dist[i] = Math.min(dist[i], lastStore - i);
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int[] stores = {0, 0, 1, 0, 0, 0, 1, 0};

        int[] result = nearestStoreDistance(stores);

        System.out.println("Distance of nearest stores:");
        System.out.println(Arrays.toString(result));
    }
}