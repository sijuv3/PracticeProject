package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * https://leetcode.com/problems/merge-intervals/
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] result = merge(new int[][]{
                {1, 3}, {8, 10}, {2, 6}, {15, 18}
        });
        for (int[] row : result)
            System.out.println(Arrays.toString(row));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Can use below Comparator also
        //Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0])
                merged.add(interval);
            else
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);

        }
        return merged.toArray(new int[merged.size()][]);
    }
}
