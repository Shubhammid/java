package series;
import java.util.*;

public class Day64_1 {
    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] result = mergeTwoLists(a, b);

        System.out.println(Arrays.toString(result));
    }

    static int[] mergeTwoLists(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        while (i < a.length) res[k++] = a[i++];
        while (j < b.length) res[k++] = b[j++];

        return res;
    }
}
