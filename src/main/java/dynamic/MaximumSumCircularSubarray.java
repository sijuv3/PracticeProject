package dynamic;

/*
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 */
public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        MaximumSumCircularSubarray msc = new MaximumSumCircularSubarray();
        System.out.println(msc.maxSubarraySumCircular(new int[]{1, -2, 3, -2}));
        System.out.println(msc.maxSubarraySumCircular(new int[]{5, -3, 5}));
        System.out.println(msc.maxSubarraySumCircular(new int[]{-3, -2, -3}));
    }

    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, maxSum = nums[0], curMax = 0, minSum = nums[0], curMin = 0;
        for (int a : nums) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}
