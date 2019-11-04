package com.learning.Number200;

/**
 * @Author xuetao
 * @Description: 给定一个整数，写一个函数来判断它是否是 2 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: 16
 * 输出: true
 * <p>
 * 示例 3:
 * <p>
 * 输入: 218
 * 输出: false
 * @Date 2019-11-04
 * @Version 1.0
 */
public class LeetCode154 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(1));
    }

    private static boolean powerOfTwo(int num) {
        int count = 0;

        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (num % 2 != 0) {
            return false;
        }


        while (num % 2 == 0) {
            count++;
            num = num >> 1;
        }

        return count % 2 == 0;
    }

}
