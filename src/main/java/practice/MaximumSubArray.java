package practice;

public class MaximumSubArray {
    public static void main(String[] args) {
        MaximumSubArray ms = new MaximumSubArray();
        System.out.println(ms.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(ms.maxSubArray(new int[]{1}));
        System.out.println(ms.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    public int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = max_sum;
        for (int i=1; i < nums.length; i++) {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }
}
