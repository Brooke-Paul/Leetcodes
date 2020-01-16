package com.learning.Number250;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。
 * 请注意，它是排序后的第k小元素，而不是第k个元素。
 * <p>
 * 示例:
 * <p>
 * matrix = [
 * [ 1, 5, 9],
 * [10, 11, 13],
 * [12, 13, 15]
 * ],
 * k = 8,
 * <p>
 * 返回 13。
 * <p>
 * 说明:
 * 你可以假设 k 的值永远是有效的, 1 ≤ k ≤ n 2 。
 * <p>
 * Created by xuetao on 2020/1/16
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode264 {
    public static void main(String[] args) {
        int[][] array = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        int k = 1;
        System.out.println(findMiniEstK(array, k));
    }

    private static int findMiniEstK(int[][] array, int k) {
        int row = array.length;
        int col = array[0].length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                list.add(array[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k - 1);
    }
}
