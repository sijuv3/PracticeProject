package practice;

import java.util.Arrays;

public class FindFirstAndLastIndex {

    /*
    * Leetcode # 34
    * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
    * If target is not found in the array, return [-1, -1].
    */
    public static void main(String[] args) {
        FindFirstAndLastIndex ff = new FindFirstAndLastIndex();
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(ff.searchRange(nums, 8)));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStatingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }

    public int findStatingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;

            if (nums[midpoint] >= target)
                end = midpoint - 1;
            else
                start = midpoint + 1;

            if (nums[midpoint] == target)
                index = midpoint;
        }

        return index;
    }

    public int findEndingIndex(int[] nums, int target) {
        int index = -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;

            if (nums[midpoint] <= target)
                start = midpoint + 1;
            else
                end = midpoint - 1;

            if (nums[midpoint] == target)
                index = midpoint;
        }

        return index;
    }
}
