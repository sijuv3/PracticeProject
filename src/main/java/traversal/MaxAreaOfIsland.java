package traversal;

/*
 * https://leetcode.com/problems/max-area-of-island/
 */
public class MaxAreaOfIsland {
    public static void main(String[] args) {
        MaxAreaOfIsland m = new MaxAreaOfIsland();
        int[][] grid = {
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1 ,0, 0},
            {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(m.maxAreaOfIsland(grid));
    }

    boolean[][] seen;

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        int rows = grid.length;
        int columns = grid[0].length;
        seen = new boolean[rows][columns];

        for (int i=0; i < rows; i++) {
            for (int j=0; j<columns; j++) {
                if (grid[i][j] == 1)
                    maxArea = Math.max(maxArea, area(i, j, grid));
            }
        }
        return maxArea;
    }

    private int area(int row, int col, int[][] grid) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length
                || seen[row][col] || grid[row][col] == 0)
            return 0;
        seen[row][col] = true;
        return (1 + area(row + 1, col, grid) + area(row - 1, col, grid)
                + area(row, col - 1, grid) + area(row, col + 1, grid));
    }
}
