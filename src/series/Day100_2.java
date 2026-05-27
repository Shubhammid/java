package series;

import java.util.*;

public class Day100_2 {
    static class Pair {
        int row;
        int col;
        int distance;
        Pair(int row, int col, int distance) {
            this.row = row;
            this.col = col;
            this.distance = distance;
        }
    }
    static int[] rowDir = {-1, 1, 0, 0};
    static int[] colDir = {0, 0, -1, 1};
    public static int shortestPath(int[][] grid,
                                   int sr, int sc,
                                   int dr, int dc) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (grid[sr][sc] == 0 || grid[dr][dc] == 0) {
            return -1;
        }
        boolean[][] visited = new boolean[rows][cols];
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(sr, sc, 0));
        visited[sr][sc] = true;
        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            int row = current.row;
            int col = current.col;
            int dist = current.distance;
            if (row == dr && col == dc) {
                return dist;
            }
            for (int k = 0; k < 4; k++) {
                int newRow = row + rowDir[k];
                int newCol = col + colDir[k];
                if (isValid(grid, visited, newRow, newCol)) {
                    visited[newRow][newCol] = true;
                    queue.offer(
                            new Pair(newRow, newCol, dist + 1)
                    );
                }
            }
        }
        return -1;
    }
    private static boolean isValid(int[][] grid,
                                   boolean[][] visited,
                                   int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        return row >= 0 && col >= 0
                && row < rows && col < cols
                && grid[row][col] == 1
                && !visited[row][col];
    }
    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 1}
        };
        int sourceRow = 0;
        int sourceCol = 0;
        int destRow = 3;
        int destCol = 3;
        int result = shortestPath(
                grid,
                sourceRow,
                sourceCol,
                destRow,
                destCol
        );
        System.out.println("Shortest Path Length: " + result);
    }
}