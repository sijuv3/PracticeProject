package dynamic;

/*
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobber {
    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        System.out.println(hr.rob(new int[]{1, 2, 3, 1}));
        System.out.println(hr.rob(new int[]{2, 7, 9, 3, 1}));

        System.out.println(hr.rob2(new int[]{1, 2, 3, 1}));
        System.out.println(hr.rob2(new int[]{2, 7, 9, 3, 1}));

        System.out.println(hr.rob3(new int[]{1, 2, 3, 1}));
        System.out.println(hr.rob3(new int[]{2, 7, 9, 3, 1}));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }

    public int rob2(int[] nums) {
        if (nums.length == 0)
            return 0;

        int dp[] = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
        }

        return dp[nums.length];
    }

    public int rob3(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int val1 = nums[0], val2 = Math.max(val1, nums[1]);
        for (int i = 2; i < nums.length; i++) {
            int temp = val2;
            val2 = Math.max(val2, val1 + nums[i]);
            val1 = temp;
        }
        return val2;
    }
}
