package com.learning;

/**
 * @Author xuetao
 * @Description: 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * <p>
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * <p>
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 * <p>
 * <p>
 * <p>
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 * <p>
 * 说明： m 和 n 的值均不超过 100。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * 输出: 2
 * 解释:
 * 3x3 网格的正中间有一个障碍物。
 * 从左上角到右下角一共有 2 条不同的路径：
 * 1. 向右 -> 向右 -> 向下 -> 向下
 * 2. 向下 -> 向下 -> 向右 -> 向右
 * @Date 2019-07-18
 * @Version 1.0
 */
public class LeetCode63 {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] array = {{0, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 1) {
                    result[i][j] = 0;
                } else if (i == 0 && j == 0) {
                    result[i][j] = 1;
                } else if (i == 0 && j > 0) {
                    result[i][j] = result[i][j - 1];
                } else if (j == 0 && i > 0) {
                    result[i][j] = result[i - 1][j];
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }
        }

        System.out.println(result[m - 1][n - 1]);
    }

}
