package traversal;

public class NumberOfIslands {
    public static void main(String[] args) {
        NumberOfIslands ns = new NumberOfIslands();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(ns.solution(grid));
    }

    public int solution(char[][] grid) {
        int count = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    callBFS(grid, i, j);
                    count += 1;
                }
            }
        }
        return count;
    }

    public void callBFS(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        callBFS(grid, i+1, j); // up
        callBFS(grid, i-1, j); // down
        callBFS(grid, i, j-1); // left
        callBFS(grid, i, j+1); // right
    }
}
