package practice;

import java.util.Arrays;
/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        System.out.println(Arrays.toString(r.solution(new int[] {1, 2, 3, 4, 5, 6, 7}, 3)));
    }

    private int[] solution(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return nums;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
