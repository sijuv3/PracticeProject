package practice;

import java.util.Arrays;
/*
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * Let n = 7 and k = 3.
 * Original List                    : 1 2 3 4 5 6 7
 * After reversing all numbers      : 7 6 5 4 3 2 1
 * After reversing 1st k numbers    : 5 6 7 4 3 2 1
 * After reversing last n-k numbers : 5 6 7 1 2 3 4
 */
public class RotateArray {
    public static void main(String[] args) {
        RotateArray r = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(r.solution(arr, 3)));
        //Arrays.stream(arr).forEach(System.out::println);
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
