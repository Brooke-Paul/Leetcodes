package com.learning;

/**
 * @Author xuetao
 * @Description: 给定一个正整数 n ，生成一个包含 1 到 n 2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 * @Date 2019-07-13
 * @Version 1.0
 */
public class LeetCode59 {
    public static void main(String[] args) {

        int[][] array = generateArray(4);
        spiralOrder(array);
    }

    /**
     * 生成二维数组
     *
     * @param n
     * @return
     */
    private static int[][] generateArray(int n) {
        int[][] array = new int[n][n];
        int x = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = x++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        return array;
    }


    /**
     * 思路：  新增临时数组，顺时针获取目标数组的值
     *
     * @param array
     * @return
     */
    private static int[][] spiralOrder(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int[][] result = new int[row][col];

        int rowStart = 0;
        int colStart = 0;
        int m = 0;
        int n = 0;
        row = row - 1;
        col = col - 1;
        while (rowStart <= row && colStart <= col) {

            // right
            for (int j = colStart; j <= col; j++) {
                result[rowStart][j] = array[m][n];
                n++;
                if (n == array[0].length) {
                    m++;
                    n = 0;
                }
            }
            rowStart++;

            // down
            for (int i = rowStart; i <= row; i++) {
                result[i][col] = array[m][n];
                n++;
                if (n == array[0].length) {
                    m++;
                    n = 0;
                }
            }
            col--;

            // left
            if (rowStart <= row) {
                for (int x = col; x >= colStart; x--) {
                    result[row][x] = array[m][n];
                    n++;
                    if (n == array[0].length) {
                        m++;
                        n = 0;
                    }
                }
            }
            row--;

            // up
            if (colStart <= col) {
                for (int x = row; x >= rowStart; x--) {
                    result[x][colStart] = array[m][n];
                    n++;
                    if (n == array[0].length) {
                        m++;
                        n = 0;
                    }
                }
            }
            colStart++;
        }
        System.out.println("改变后...........");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        return result;
    }


}
