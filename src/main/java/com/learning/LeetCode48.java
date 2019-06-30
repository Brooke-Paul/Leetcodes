package com.learning;

/**
 * @Author xuetao
 * @Description: 给定一个 n × n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：
 * <p>
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。 请不要 使用另一个矩阵来旋转图像。
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * <p>
 * 示例 2:
 * <p>
 * 给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],     3 6
 * [13, 3, 6, 7],     4 8
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],    00-03 01-13 02-23 03 33
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 * @Date 2019-06-29
 * @Version 1.0
 */
public class LeetCode48 {
    public static void main(String[] args) {
        int[][] array = {{5, 1, 9, 11}, {2, 4, 8, 10}, {3, 3, 6, 7}, {15, 14, 12, 16}};
        rotateMatrix(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int top = 0;
        int bottom = row - 1;
        while (top < bottom) {
            int[] temp = array[top];
            array[top] = array[bottom];
            array[bottom] = temp;
            top++;
            bottom--;
        }
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

    }

}
