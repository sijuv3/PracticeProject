package practice;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        System.out.println(Arrays.toString(m.solution1(new int[]{0, 1, 0, 3, 12})));
        System.out.println(Arrays.toString(m.solution2(new int[]{0, 1, 0, 3, 12})));
    }

    private int[] solution1(int[] nums) {
        int a_pointer = 0, b_pointer = 0;
        while (b_pointer < nums.length) {
            if (nums[b_pointer] == 0) {
                b_pointer += 1;
            } else {
                int temp = nums[b_pointer];
                nums[b_pointer] = nums[a_pointer];
                nums[a_pointer] = temp;
                a_pointer += 1;
                b_pointer += 1;
            }
        }
        return nums;
    }

    private int[] solution2(int[] nums) {
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
