package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * 1 1 1 0 0
 * 1 1 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * <p>
 * 输出: 4
 * @Date 2019-10-25
 * @Version 1.0
 */
public class LeetCode147 {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 0, 0}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 0, 1, 0}};
        System.out.println(square(array));
    }

    private static int square(int[][] array) {
        int max = Integer.MIN_VALUE;
        if (array == null || array.length == 0) {
            return 0;
        }

        int m = array.length;
        int n = array[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = array[i][j];
                } else {
                    if (array[i][j] == 0) {
                        dp[i][j] = array[i][j];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                    }
                }
                max = max < dp[i][j] ? dp[i][j] : max;
            }
        }

        return max * max;

    }

}
