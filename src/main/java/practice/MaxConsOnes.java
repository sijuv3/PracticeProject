package practice;
/*
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsOnes {

    public static void main(String args[]) {
        MaxConsOnes m = new MaxConsOnes();
        System.out.println(m.findMaxConsecutiveOnes(new int[]{
                1, 1, 0, 1, 1, 1
        }));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int contOnes = 0;
        int pointer = 0;
        while (pointer < nums.length) {
            if (nums[pointer] == 1)
                contOnes++;
            else
                contOnes = 0;
            max = Math.max(contOnes, max);
            pointer++;
        }
        return max;
    }
}
