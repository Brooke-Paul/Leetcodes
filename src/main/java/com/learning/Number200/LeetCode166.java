package com.learning.Number200;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 * <p>
 * 说明:
 * 你的算法应具有线性时间复杂度。你能否仅使用额外常数空间来实现?
 * @Date 2019-11-18
 * @Version 1.0
 */
public class LeetCode166 {
    public static void main(String[] args) {
        int[] array = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber(array));
    }

    private static int missingNumber(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                return i;
            }
        }
        return 0;
    }
}
