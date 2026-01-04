package series;

public class Day40_2 {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;   // important
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.print("Original Array: ");
        printArray(arr);
        leftRotate(arr, k);
        System.out.print("Array after left rotation by " + k + ": ");
        printArray(arr);
    }
}

