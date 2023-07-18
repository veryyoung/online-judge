package me.veryyoung.oj.leetcode;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        if (prices.length == 2) {
            return prices[0] >= prices[1] ? 0 : prices[1] - prices[0];
        }
        int maxProfit = 0;
        int buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            buyPrice = Math.min(buyPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
        }
        return maxProfit;
    }

}
