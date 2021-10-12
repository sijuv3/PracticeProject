package practice;

import java.util.Arrays;

public class TwoSumII {
    /*
    * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= first < second <= numbers.length.
    * Return the indices of the two numbers, index1 and index2, as an integer array [index1, index2] of length 2.
    * The tests are generated such that there is exactly one solution. You may not use the same element twice.
    */
    public static void main(String[] args) {
        TwoSumII tt = new TwoSumII();
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(tt.twoSum(arr, target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        while (a_pointer <= b_pointer) {
            int sum = numbers[a_pointer] + numbers[b_pointer];
            if (sum > target) {
                b_pointer -= 1;
            } else if (sum < target) {
                a_pointer += 1;
            } else {
                return new int[]{a_pointer + 1, b_pointer + 1};
            }
        }
        return new int[]{a_pointer + 1, b_pointer + 1};
    }
}
