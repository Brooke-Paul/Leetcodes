package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 我们正在玩一个猜数游戏，游戏规则如下：
 * <p>
 * 我从 1 到 n 之间选择一个数字，你来猜我选了哪个数字。
 * <p>
 * 每次你猜错了，我都会告诉你，我选的数字比你的大了或者小了。
 * <p>
 * 然而，当你猜了数字 x 并且猜错了的时候，你需要支付金额为 x 的现金。直到你猜到我选的数字，你才算赢得了这个游戏。
 * <p>
 * 示例:
 * <p>
 * n = 10, 我选择了8.
 * <p>
 * 第一轮: 你猜我选择的数字是5，我会告诉你，我的数字更大一些，然后你需要支付5块。
 * 第二轮: 你猜是7，我告诉你，我的数字更大一些，你支付7块。
 * 第三轮: 你猜是9，我告诉你，我的数字更小一些，你支付9块。
 * <p>
 * 游戏结束。8 就是我选的数字。
 * <p>
 * 你最终要支付 5 + 7 + 9 = 21 块钱。
 * <p>
 * 给定一个 n ≥ 1， 计算你至少需要拥有多少现金才能确保你能赢得这个游戏。
 * <p>
 * 致谢:
 * <p>
 * 特别感谢 @agave 和 @StefanPochmann 添加了这道题目，并且提供了所有测试用例。
 * <p>
 * Created by xuetao on 2020/1/13
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode261 {//1,2,3,4,5,6,7,8,9,10,11,12,13

    public static void main(String[] args) {
        System.out.println(getMoneyAmount(13));
    }

    public static int getMoneyAmount(int n) {
        int[][] table = new int[n + 1][n + 1];
        return dp(table, 1, n);
    }

    private static int dp(int[][] table, int s, int e) {
        if (s >= e) {
            return 0;
        }
        if (table[s][e] != 0) {
            return table[s][e];
        }
        int res = Integer.MAX_VALUE;
        for (int i = s; i <= e; i++) {
            int temp = i + Math.max(dp(table, s, i - 1), dp(table, i + 1, e));
            res = Math.min(res, temp);
        }
        table[s][e] = res;
        return res;
    }
}
