package series;

import java.util.ArrayList;

public class Day99_2 {
    public static int minTotalDistance(int[][] grid) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rows.add(i);
                }
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 1) {
                    cols.add(j);
                }
            }
        }
        int rowMedian = rows.get(rows.size() / 2);
        int colMedian = cols.get(cols.size() / 2);
        int distance = 0;
        for (int r : rows) {
            distance += Math.abs(r - rowMedian);
        }
        for (int c : cols) {
            distance += Math.abs(c - colMedian);
        }
        return distance;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0}
        };
        System.out.println("Minimum Distance: " + minTotalDistance(grid));
    }
}