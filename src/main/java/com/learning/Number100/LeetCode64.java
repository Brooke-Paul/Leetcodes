package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明： 每次只能向下或者向右移动一步。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * @Date 2019-07-18
 * @Version 1.0
 */
public class LeetCode64 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = array.length;
        int n = array[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    result[i][j] = array[i][j];
                } else if (i == 0 && j > 0) {
                    result[i][j] = array[i][j] + result[i][j - 1];
                } else if (j == 0 && i > 0) {
                    result[i][j] = array[i][j] + result[i - 1][j];
                } else {
                    result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + array[i][j];
                }
            }
        }

        System.out.println(result[m - 1][n - 1]);
    }

}
