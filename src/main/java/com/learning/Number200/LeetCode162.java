package com.learning.Number200;

/**
 * @Author xuetao
 * @Description: 给定一个非负整数 num ，反复将各个位上的数字相加，直到结果为一位数。
 * <p>
 * 示例:
 * <p>
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为**：**3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 * <p>
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 * @Date 2019-11-14
 * @Version 1.0
 */
public class LeetCode162 {

    public static void main(String[] args) {
        System.out.println(dfsSum(191));
    }

    private static int dfsSum(int num) {
        while (num > 10) {
            num = sum(num);
        }
        return num;
    }

    private static int sum(int num) {
        int sum = 0;
        while (num > 10) {
            sum += num / 10;
            num = num % 10;
        }
        sum += num;
        return sum;
    }
}
