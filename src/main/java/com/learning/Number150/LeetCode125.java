package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * <p>
 * 注意: 你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,4,1], k = 2
 * 输出: 2
 * 解释: 在第 1 天 (股票价格 = 2) 的时候买入，在第 2 天 (股票价格 = 4) 的时候卖出，这笔交易所能获得利润 = 4-2 = 2 。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,2,6,5,0,3], k = 2
 * 输出: 7
 * 解释: 在第 2 天 (股票价格 = 2) 的时候买入，在第 3 天 (股票价格 = 6) 的时候卖出, 这笔交易所能获得利润 = 6-2 = 4 。
 * 随后，在第 5 天 (股票价格 = 0) 的时候买入，在第 6 天 (股票价格 = 3) 的时候卖出, 这笔交易所能获得利润 = 3-0 = 3 。
 * @Date 2019-09-27
 * @Version 1.0
 */
public class LeetCode125 {
    public static void main(String[] args) {

        int[] array = {3, 2, 6, 5, 0, 3};
        int k = 2;
        System.out.println(maxStocks(array, k));
    }


    private static int maxStocks(int[] array, int k) {
        if (array == null || array.length < 2) {
            return 0;
        }
        int length = array.length;

        if (k >= length / 2) {
            int price = 0;
            for (int i = 1; i < length; i++) {
                if (array[i] > array[i - 1]) {
                    price += array[i] - array[i - 1];
                }
            }
            return price;
        }


        int[][] buy = new int[k + 1][length];
        for (int j = 1; j <= k; j++) {
            int temp = -array[0];
            for (int m = 1; m < length; m++) {
                buy[j][m] = Math.max(buy[j][m - 1], array[m] + temp);
                System.out.println("j=" + j + ",m=" + m + ",buy=" + buy[j][m]);

                temp = Math.max(temp, buy[j - 1][m - 1] - array[m]);
                System.out.println("temp=" + temp);
            }
        }
        return buy[k][length - 1];

    }
}
