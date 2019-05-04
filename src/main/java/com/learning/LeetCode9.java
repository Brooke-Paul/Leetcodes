package com.learning;

/**
 * @Author xuetao
 * @Description: 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>12121
 * 输入: 121
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * <p>
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 * @Date 2019-05-01
 * @Version 1.0
 */
public class LeetCode9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome1(12121));
        System.out.println(isPalindrome2(12121));
    }

    /**
     * 常规解法
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome1(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        int temp = 0;
        int m = x;
        while (m > 0) {
            temp = temp * 10 + m % 10;
            m = m / 10;
        }
        return temp == x;
    }


    /**
     * 快速解法
     *
     * @param x
     * @return
     */
    public static boolean isPalindrome2(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        int temp = 0;
        int m = x;
        while (m > temp) {
            temp = temp * 10 + m % 10;
            m = m / 10;
        }
        return temp == m || m == temp / 10;
    }

}
