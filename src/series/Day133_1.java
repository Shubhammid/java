package series;

public class Day133_1 {

    static class NumMatrix {
        private int[][] prefix;

        public NumMatrix(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            prefix = new int[rows + 1][cols + 1];

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    prefix[i][j] = matrix[i - 1][j - 1]
                            + prefix[i - 1][j]
                            + prefix[i][j - 1]
                            - prefix[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return prefix[row2 + 1][col2 + 1]
                    - prefix[row1][col2 + 1]
                    - prefix[row2 + 1][col1]
                    + prefix[row1][col1];
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };

        NumMatrix obj = new NumMatrix(matrix);

        System.out.println(obj.sumRegion(2, 1, 4, 3)); // 8
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // 12
    }
}