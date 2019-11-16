package com.learning.Number200;

/**
 * @Author xuetao
 * @Description: 编写一个程序判断给定的数是否为丑数。
 * <p>
 * 丑数就是只包含质因数 2, 3, 5 的 正整数 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 6
 * 输出: true
 * 解释: 6 = 2 × 3
 * <p>
 * 示例 2:
 * <p>
 * 输入: 8
 * 输出: true
 * 解释: 8 = 2 × 2 × 2
 * <p>
 * 示例 3:
 * <p>
 * 输入: 14
 * 输出: false
 * 解释: 14 不是丑数，因为它包含了另外一个质因数 7。
 * <p>
 * 说明：
 * <p>
 * 1 是丑数。
 * 输入不会超过 32 位有符号整数的范围: [−2 31 ,  2 31 − 1]。
 * @Date 2019-11-16
 * @Version 1.0
 */
public class LeetCode164 {
    public static void main(String[] args) {
        System.out.println(uglinessNumber(5));
    }

    private static boolean uglinessNumber(int num) {
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false;
            }
        }
        return num == 1;
    }

}
