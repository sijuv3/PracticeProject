package practice;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        BestTimeToBuySellStock bb = new BestTimeToBuySellStock();
        System.out.println(bb.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(bb.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else
                max = Math.max(max, prices[i] - min);
        }

        return max;
    }
}
