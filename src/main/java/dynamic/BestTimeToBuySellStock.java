package dynamic;

/*
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        BestTimeToBuySellStock bb = new BestTimeToBuySellStock();
        // Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        System.out.println(bb.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(bb.maxProfit(new int[]{7, 6, 4, 3, 1}));

        System.out.println(bb.maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0 ;

        int profit = 0;
        int minPriceSoFar = Integer.MAX_VALUE;//prices[0];//Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPriceSoFar)
                minPriceSoFar = price;
            else
                profit = Math.max(profit, price - minPriceSoFar);
        }

        return profit;
    }

    public int maxProfit2(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(price - min, max);
        }
        return max;
    }
}