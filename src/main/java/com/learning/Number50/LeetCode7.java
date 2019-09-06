package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * 注意:
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31 ,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 * @Date 2019-04-28
 * @Version 1.0
 */
public class LeetCode7 {
    public static void main(String[] args) {

        System.out.println( reverse(-123123131));
    }

    public static int reverse(int x) {
        long s = 0;

        while (x != 0) {
            s = x % 10 + s * 10;
            x = x / 10;

            if (s > Integer.MAX_VALUE || s < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)s;
    }

}
