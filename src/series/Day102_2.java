package series;

import java.util.*;

public class Day102_2 {
    private final int[][] dirs = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
    };
    public int shortestPath(int[][] grid, int[] source, int[] destination) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (grid[source[0]][source[1]] == 0
                || grid[destination[0]][destination[1]] == 0) {

            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        queue.offer(new int[]{
                source[0],
                source[1],
                0
        });
        visited[source[0]][source[1]] = true;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int dist = current[2];
            if (row == destination[0]
                    && col == destination[1]) {

                return dist;
            }
            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if (isValid(grid, newRow, newCol)
                        && !visited[newRow][newCol]
                        && grid[newRow][newCol] == 1) {
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{
                            newRow,
                            newCol,
                            dist + 1
                    });
                }
            }
        }
        return -1;
    }
    private boolean isValid(int[][] grid, int row, int col) {
        return row >= 0
                && col >= 0
                && row < grid.length
                && col < grid[0].length;
    }
    public static void main(String[] args) {
        Day102_2 obj = new Day102_2();
        int[][] grid = {
                {1, 1, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 1, 1},
                {0, 1, 0, 1}
        };
        int[] source = {0, 0};
        int[] destination = {2, 3};
        System.out.println(
                obj.shortestPath(grid, source, destination)
        );
    }
}