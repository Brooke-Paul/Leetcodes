package com.learning;

/**
 * @Author xuetao
 * @Description: 给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用 原地 算法 。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 * [1,1,1],
 * [1,0,1],
 * [1,1,1]
 * ]
 * 输出:
 * [
 * [1,0,1],
 * [0,0,0],
 * [1,0,1]
 * ]
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * [
 * [0,1,2,0],
 * [3,4,5,2],
 * [1,3,1,5]
 * ]
 * 输出:
 * [
 * [0,0,0,0],
 * [0,4,5,0],
 * [0,3,1,0]
 * ]
 * <p>
 * 进阶:
 * <p>
 * 一个直接的解决方案是使用  O( m n ) 的额外空间，但这并不是一个好的解决方案。
 * 一个简单的改进方案是使用 O( m + n ) 的额外空间，但这仍然不是最好的解决方案。
 * 你能想出一个常数空间的解决方案吗？
 * @Date 2019-07-28
 * @Version 1.0
 */
public class LeetCode72 {

    public static void main(String[] args) {
        int[][] array = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] array) {
        int row = array.length;
        int col = array[0].length;

        boolean[][] result = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] == 0) {
                    result[i][j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (result[i][j]) {
                    for (int x = 0; x < row; x++) {
                        array[x][j] = 0;
                    }
                    for (int y = 0; y < col; y++) {
                        array[i][y] = 0;
                    }
                }
            }
        }
    }
}
