package com.learning.Number200;

/**
 * @Author xuetao
 * @Description: Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <p>
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * For example,
 * <p>
 * Consider the following matrix:
 * <p>
 * [
 * [1, 4, 7, 11, 15],
 * [2, 5, 8, 12, 19],
 * [3, 6, 9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * <p>
 * Given target = 5 , return true .
 * <p>
 * Given target = 20 , return false .
 * @Date 2019-11-09
 * @Version 1.0
 */
public class LeetCode159 {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(findTarget(array, 25));
    }

    private static boolean findTarget(int[][] array, int target) {

        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < row; i++) {
            if (array[i][0] <= target && array[i][row - 1] >= target) {
                int left = 0;
                int right = col;
                while (left < right) {
                    int mid = (left + right) / 2;
                    if (array[i][mid] < target) {
                        left++;
                    } else if (array[i][mid] > target) {
                        right--;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;

    }
}
