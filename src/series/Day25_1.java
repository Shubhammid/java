package series;

//Java Program for Bubble Sort

public class Day25_1 {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static void main(String args[])
    {
        Day25_1 ob = new Day25_1();
        int a[] = { 64, 34, 25, 12 };
        ob.bubbleSort(a);
        int n = a.length;
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
