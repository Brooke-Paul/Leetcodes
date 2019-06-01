package com.learning;

/**
 * @Author xuetao
 * @Description: 给定两个整数，被除数 dividend 和除数 divisor 。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * <p>
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * <p>
 * 示例 1:
 * <p>
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * <p>
 * 示例 2:
 * <p>
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * <p>
 * 说明:
 * <p>
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2 31 ,  2 31 − 1]。本题中，如果除法结果溢出，则返回 2 31 − 1。
 * @Date 2019-05-31
 * @Version 1.0
 */
public class LeetCode29 {

    /**
     * 使用位运算符
     * 判断运算后的符号标志
     * 如果 a >= b, b<<2, n+1， 循环执行， 如果 a < 2b, a-b 继续与b比较，直到 循环结束
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(divide(8, 3));
    }

    public static int divide(int dividend, int divisor) {

        if (divisor == 0 || (dividend == 1 && divisor == Integer.MIN_VALUE)) {
            return Integer.MAX_VALUE;
        }
        boolean sign = ((dividend > 0) ^ (divisor > 0));
        int sum = 0;

        while (dividend >= divisor) {
            int n = divisor;
            int m = 1;
            while (dividend >= (n << 1)) {
                m = m << 1;
                n = n << 1;
            }
            sum += m;
            dividend = dividend - n;

        }
        return sign ? -sum : sum;
    }
}
