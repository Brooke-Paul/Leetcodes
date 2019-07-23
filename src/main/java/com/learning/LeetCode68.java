package com.learning;

/**
 * @Author xuetao
 * @Description: 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 * @Date 2019-07-23
 * @Version 1.0
 */
public class LeetCode68 {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(sqrt(num));
    }

    private static int sqrt(int num) {
        int left = 0;
        int right = num;
        int mid = (left + right) / 2;

        while (left <= right) {
            int x = mid * mid;
            if (x > num) {
                right = mid - 1;
            } else if (x < num) {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }
        return mid;
    }
}
