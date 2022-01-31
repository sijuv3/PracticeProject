package dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/pascals-triangle/
 * Input: numRows = 5
 * Output: [
 *                  [1],
 *                 [1,1],
 *                [1,2,1],
 *               [1,3,3,1],
 *              [1,4,6,4,1]
 *          ]
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        System.out.println(Arrays.toString(pt.generate(5).toArray()));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0)
            return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            row.add(1);
            triangle.add(row);
        }

        return triangle;
    }
}
