package series;

public class Day163_2 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 40, 30};

        boolean[] visited = new boolean[arr.length];

        System.out.println("Frequency of each element:");

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}