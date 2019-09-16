package com.learning.Number150;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定一个无序的数组，找出数组在排序之后，相邻元素之间最大的差值。
 * <p>
 * 如果数组元素个数小于 2，则返回 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [10]
 * 输出: 0
 * 解释: 数组元素个数小于 2，因此返回 0。
 * <p>
 * 说明:
 * <p>
 * 你可以假设数组中所有元素都是非负整数，且数值在 32 位有符号整数范围内。
 * 请尝试在线性时间复杂度和空间复杂度的条件下解决此问题。
 * @Date 2019-09-16
 * @Version 1.0
 */
public class LeetCode115 {
    public static void main(String[] args) {
        int[] array = {3, 7, 9, 1, 6, 9, 9};
        Arrays.sort(array);
        System.out.println(findMaxValue(array));
    }

    private static int findMaxValue(int[] array) {
        long startTime = System.currentTimeMillis();
        if (array == null || array.length < 2) {
            return 0;
        }
        int len = array.length;
        int max = 0;

        for (int i = 1; i < len; i++) {
            if (array[i] == array[i - 1]) {
                continue;
            }

            max = Math.max(array[i] - array[i - 1], max);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("cost(" + (endTime - startTime) + ")ms");
        return max;
    }
}
