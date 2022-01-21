package dynamic;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        MinCostClimbingStairs mcs = new MinCostClimbingStairs();
        System.out.println(mcs.minCostClimbingStairs1(new int[]{10, 15, 20}));
        System.out.println(mcs.minCostClimbingStairs1(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        System.out.println(mcs.minCostClimbingStairs2(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    public int minCostClimbingStairs1(int[] cost) {
        // start at index 2 and check which is the smallest from 0 and 1 index
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }

    public int minCostClimbingStairs2(int[] cost) {
        int first = cost[0];
        int second = cost[1];
        if (cost.length <= 2)
            return Math.min(first, second);
        for (int i = 2; i < cost.length; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);
    }
}
