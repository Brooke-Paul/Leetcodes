package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [5,7]
 * 输出: 4
 * <p>
 * 示例 2:
 * <p>
 * 输入: [0,1]
 * 输出: 0
 * @Date 2019-10-06
 * @Version 1.0
 */
public class LeetCode132 {

    public static void main(String[] args) {
        int m = 5;
        int n = 7;
        System.out.println(rangeBitwise(m, n));
    }

    private static int rangeBitwise(int m, int n) {
        int result = m;
        for (int i = m + 1; i <= n; i++) {
            result &= i;
        }
        return result;
    }
}
