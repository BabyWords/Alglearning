package leetcode.bestTimeToBuyAndSellStockII;

/**
 * LeetCode 122
 */
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        //贪心思想,每一次只要地鹅鹅鹅而天比前一天高就立刻卖出,这样的话总和是不变的
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
