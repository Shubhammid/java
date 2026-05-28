package series;

public class Day101_2 {
    static int[] delRow = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] delCol = {-1, 0, 1, -1, 1, -1, 0, 1};
    public int maxRegion(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int maxArea = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = dfs(grid, visited, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
    private int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        visited[row][col] = true;
        int count = 1;
        for (int i = 0; i < 8; i++) {
            int newRow = row + delRow[i];
            int newCol = col + delCol[i];
            if (isValid(grid, visited, newRow, newCol)) {
                count += dfs(grid, visited, newRow, newCol);
            }
        }
        return count;
    }
    private boolean isValid(int[][] grid, boolean[][] visited,
                            int row, int col) {
        return row >= 0 &&
                col >= 0 &&
                row < grid.length &&
                col < grid[0].length &&
                grid[row][col] == 1 &&
                !visited[row][col];
    }
    public static void main(String[] args) {
        Day101_2 obj = new Day101_2();
        int[][] grid = {
                {0, 0, 1, 1},
                {1, 0, 1, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 0}
        };
        System.out.println(obj.maxRegion(grid));
    }
}