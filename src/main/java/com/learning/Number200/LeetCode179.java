package com.learning.Number200;

import java.util.Arrays;

/**
 * Program Name: leetcodes
 * <p>
 * Description:给定一个无序的整数数组，找到其中最长上升子序列的长度。
 * <p>
 * 示例:
 * <p>
 * 输入: [10,9,2,5,3,7,101,18] 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * <p>
 * 说明:
 * <p>
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O( n 2 ) 。
 * 进阶: 你能将算法的时间复杂度降低到 O( n log n ) 吗?
 * <p>
 * Created by xuetao on 2019/12/6
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode179 {
    public static void main(String[] args) {
        int[] array = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(maxLength(array));
    }


    private static int maxLength(int[] array) {
        int dp[] = new int[array.length];
        int temp = 0;
        for (int x : array) {
            int index = Arrays.binarySearch(dp, 0, temp, x);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = x;
            if (index == temp) {
                temp++;
            }
        }
        return temp;

    }
}
