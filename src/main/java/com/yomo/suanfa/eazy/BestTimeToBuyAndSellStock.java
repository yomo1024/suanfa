package com.yomo.suanfa.eazy;

/**
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * @author yomo
 * @since 2023/1/5
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] nums = {6,2,7,1,5,3,4};
        System.out.println(maxProfit(nums));
    }
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            // 如果当前价格小于最小价格，就将当前价格赋值给最小价格
            if (price < minPrice) {
                minPrice = price;
            //    因为最小价格是从前面得到的，所以我们可以确定条件中买入的价格一定比卖出的价格低。
            } else if (price - minPrice > maxProfit) {
                // 已经确定了最低的价格，那么只要用当前价格减去最小价格，不断的更新maxProfit就可以了
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
