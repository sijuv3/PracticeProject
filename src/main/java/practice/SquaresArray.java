package practice;

import java.util.Arrays;

/*
* Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/
public class SquaresArray {
    public static void main(String[] args) {
        SquaresArray s = new SquaresArray();
        System.out.println(Arrays.toString(s.solution(new int[]{-4, -1, 0, 3, 10})));
    }
    /*private int[] solution(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        return nums;
    }*/

    private int[] solution(int[] nums) {
        int n = nums.length;

        int positive_pointer = 0;
        // while pointer hasn't reached end of array && pointer value is not less than 0, keep incrementing pointer
        while (positive_pointer < n && nums[positive_pointer] < 0) {
            positive_pointer += 1;
        }

        int negative_pointer = positive_pointer - 1;
        int[] squared_array = new int[n];
        int counter = 0;
        while (negative_pointer >=0 && positive_pointer < n) {
            // Check the square first and add the smallest value to the array
            if (Math.pow(nums[negative_pointer], 2) < Math.pow(nums[positive_pointer], 2)) {
                squared_array[counter] = (int)Math.pow(nums[negative_pointer], 2);
                negative_pointer -= 1;
            } else {
                squared_array[counter] = (int)Math.pow(nums[positive_pointer], 2);
                positive_pointer += 1;
            }
            counter += 1;
        }

        while (negative_pointer >= 0) {
            squared_array[counter] = (int)Math.pow(nums[negative_pointer], 2);
            negative_pointer -= 1;
            counter += 1;
        }
        while ((positive_pointer < n)) {
            squared_array[counter] = (int)Math.pow(nums[positive_pointer], 2);
            positive_pointer += 1;
            counter += 1;
        }

        return squared_array;
    }
}
