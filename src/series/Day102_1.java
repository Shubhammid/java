package series;

import java.util.*;

public class Day102_1 {
    private final int[][] dirs = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };
    public int longestIncreasingPath(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans = Math.max(ans, dfs(matrix, i, j, dp));
            }
        }
        return ans;
    }
    private int dfs(int[][] matrix, int row, int col, int[][] dp) {
        if (dp[row][col] != 0) {
            return dp[row][col];
        }
        int maxLen = 1;
        for (int[] dir : dirs) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValid(matrix, newRow, newCol)
                    && matrix[newRow][newCol] > matrix[row][col]) {
                maxLen = Math.max(maxLen,
                        1 + dfs(matrix, newRow, newCol, dp));
            }
        }
        dp[row][col] = maxLen;
        return maxLen;
    }
    private boolean isValid(int[][] matrix, int row, int col) {
        return row >= 0
                && col >= 0
                && row < matrix.length
                && col < matrix[0].length;
    }
    public static void main(String[] args) {
        Day102_1 obj = new Day102_1();
        int[][] matrix = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        System.out.println(obj.longestIncreasingPath(matrix));
    }
}