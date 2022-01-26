package dynamic;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class BestTimeToBuySellStockII {
    public static void main(String[] args) {
        BestTimeToBuySellStockII bt = new BestTimeToBuySellStockII();
        //System.out.println(bt.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(bt.maxProfit(new int[]{1, 2, 3, 4, 5}));
        //System.out.println(bt.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i])
                profit += prices[i + 1] - prices[i];
        }

        return profit;
    }
}
