package com.learning.Number200;

/**
 * @Author xuetao
 * @Description: 编写一个程序，找出第 n 个丑数。
 * <p>
 * 丑数就是只包含质因数 2, 3, 5 的 正整数 。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 10
 * 输出: 12
 * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前10个丑数。
 * <p>
 * 说明:
 * <p>
 * 1 是丑数。
 * n 不超过 1690。
 * @Date 2019-11-17
 * @Version 1.0
 */
public class LeetCode165 {
    public static void main(String[] args) {
        int n = 12;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (uglinessNumber(i)) {
                System.out.println(i);
                n--;
                if (n == 0) {
                    return;
                }
            }
        }

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
