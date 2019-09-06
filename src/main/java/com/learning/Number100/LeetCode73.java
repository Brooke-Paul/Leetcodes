package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 示例 1:
 * <p>
 * 输入:
 * matrix = [
 * [1, 3, 5, 7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 3
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * matrix = [
 * [1, 3, 5, 7],
 * [10, 11, 16, 20],
 * [23, 30, 34, 50]
 * ]
 * target = 13
 * 输出: false
 * @Date 2019-07-29
 * @Version 1.0
 */
public class LeetCode73 {

    /**
     * 利用二分查找实现
     * @param args
     */
    public static void main(String[] args) {
        int[][] array = {{1, 3, 5}, {10, 11, 16}, {23, 30, 34}};
        int target = 15;

        System.out.println(findTarget(array, target));
    }

    private static boolean findTarget(int[][] array, int target) {
        int row = array.length - 1;
        int col = array[0].length - 1;

        for (int i = 0; i <= row; i++) {
            if (array[i][col] <= target) {
                if (array[i][col] == target) {
                    return true;
                } else {
                    continue;
                }
            } else {
                int start = 0;
                int end = col;
                while (start <= end) {
                    int mid = (start + col) / 2;
                    if (array[i][mid] < target) {
                        start++;
                    } else if (array[i][mid] > target) {
                        end--;
                    } else {
                        System.out.println(array[i][mid]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
