package series;

import java.util.*;

public class Day100_1 {
    static int[] rowDir = {-1, 1, 0, 0};
    static int[] colDir = {0, 0, -1, 1};
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (row < 0 || col < 0 || row >= rows || col >= cols
                || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        for (int k = 0; k < 4; k++) {
            int newRow = row + rowDir[k];
            int newCol = col + colDir[k];
            dfs(grid, newRow, newCol);
        }
    }
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '1', '0', '1'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println("Number of Islands: " + numIslands(grid));
    }
}