package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
 * <p>
 * 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
 * <p>
 * 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 * 示例:
 * <p>
 * 输入: [1,2,3,0,2]
 * 输出: 3
 * 解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]
 * <p>
 * Created by xuetao on 2019/12/10
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode183 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0, 2};
        System.out.println(maxProfit(array));
    }

    private static int maxProfit(int[] prices) {
        int sell = 0;
        int preSell = 0;
        int buy = Integer.MIN_VALUE;
        int preBuy;
        for (int price : prices) {
            preBuy = buy;
            buy = Math.max(preSell - price, preBuy);
            preSell = sell;
            sell = Math.max(preBuy + price, preSell);
        }
        return sell;
    }


}
