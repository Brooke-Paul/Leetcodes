package com.learning;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定一个未排序的整数数组，找出最长连续序列的长度。
 * <p>
 * 要求算法的时间复杂度为 O(n) 。
 * <p>
 * 示例:
 * <p>
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 * @Date 2019-08-30
 * @Version 1.0
 */
public class LeetCode99 {
    public static void main(String[] args) {
        int[] array = {1,6,9};
//        int[] array = {1,3,5,7,6};
        Arrays.sort(array);
        System.out.println(maxSequence(array));
    }


    private static int maxSequence(int[] array) {
        int length = array.length;
        int max = 1;
        int x = array[0];
        int index = 1;
        for (int i = 1; i < length; i++) {
            if (array[i] == x + 1) {
                index++;
            } else {
                index = 1;
            }
            x = array[i];
            max = Math.max(max, index);
        }

        return max;
    }
}
