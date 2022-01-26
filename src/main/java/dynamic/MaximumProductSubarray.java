package dynamic;

/*
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaximumProductSubarray {
    public static void main(String[] args) {
        MaximumProductSubarray mps = new MaximumProductSubarray();

        System.out.println(mps.maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(mps.maxProduct(new int[]{-2, 0, -1}));

        System.out.println(mps.maxProduct2(new int[]{2, 3, -2, 4}));
        System.out.println(mps.maxProduct2(new int[]{-2, 0, -1}));
    }

    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;  // store the max because before updating min your max will already be updated
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > ans)
                ans = max;
        }
        return ans;
    }

    public int maxProduct2(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            // Swapping min and max
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
