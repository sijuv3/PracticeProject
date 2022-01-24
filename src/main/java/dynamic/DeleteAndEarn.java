package dynamic;

public class DeleteAndEarn {
    public static void main(String[] args) {
        DeleteAndEarn de = new DeleteAndEarn();
        System.out.println(de.deleteAndEarn(new int[]{3, 4, 2}));
        System.out.println(de.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    public int deleteAndEarn(int[] nums) {
        int[] buckets = new int[10001];
        for (int num : nums) {
            buckets[num] += num;
        }
        int[] dp = new int[10001];
        dp[0] = buckets[0];
        dp[1] = buckets[1];
        for (int i = 2; i < buckets.length; i++) {
            dp[i] = Math.max(buckets[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[10000];
    }
}
