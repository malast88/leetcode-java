package malast88.leetcode.problems.besttimetobuyandsellstockii;

public class BestTimeToBuyAndSellStockii {

    /**
     * Solution for https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
     * Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int overallProfit = 0;
        int maxProfit = 0;
        int buyPrice = prices[0];
        for (int i=0;i<prices.length;i++) {
            int sellPrice = prices[i];
            int sellProfit = sellPrice - buyPrice;
            if (sellProfit > maxProfit) {
                maxProfit = sellProfit;
            } else if (sellProfit < maxProfit) {
                overallProfit += maxProfit;
                maxProfit = 0;
                buyPrice = sellPrice;
            }
        }
        overallProfit += maxProfit;
        return overallProfit;
    }
}
