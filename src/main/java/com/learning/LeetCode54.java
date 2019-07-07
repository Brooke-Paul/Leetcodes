package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个包含 m x n 个元素的矩阵（ m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * [
 * [1, 2, 3, 4],
 * [5, 6, 7, 8],
 * [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 * @Date 2019-07-06
 * @Version 1.0
 */
public class LeetCode54 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralOrder(array);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;


        if (row == 0) {
            return result;
        }

        int rowstart = 0;
        int rowend = matrix.length - 1;

        int colstart = 0;
        int colend = matrix[0].length - 1;
        while (rowstart <= rowend && colstart <= colend) {
            for (int j = colstart; j <= colend; j++) {
                result.add(matrix[rowstart][j]);
            }
        }
        rowstart++;
        return result;
    }

}
