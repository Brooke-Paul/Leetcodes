package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 给定一个整数 n ，返回 n ! 结果尾数中零的数量。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * <p>
 * 示例 2:
 * <p>
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * <p>
 * 说明: 你算法的时间复杂度应为 O (log n ) 。
 * @Date 2019-09-23
 * @Version 1.0
 */
public class LeetCode121 {

    /**
     * 1~5 中一个0，  6~10中一个0，以5为单位累加
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        while (n > 4) {
            n = n / 5;
            sum += n;
        }
        System.out.println(sum);
    }
}
