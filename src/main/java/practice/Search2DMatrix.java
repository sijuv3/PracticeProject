package practice;

/*
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class Search2DMatrix {

    public static void main(String[] args) {
        Search2DMatrix ss = new Search2DMatrix();
        int[][] matrix = new int[][] {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(ss.searchMatrix(matrix, 3));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix == null)
            return false;

        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col - 1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            int midpoint_element = matrix[midpoint / col][midpoint % col];
            if (midpoint_element == target)
                return true;
            else if (target < midpoint_element)
                right = midpoint - 1;
            else
                left = midpoint + 1;
        }

        return false;
    }
}
