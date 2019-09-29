package com.learning.Number150;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5] 向右旋转 3 步: [5,6,7,1,2,3,4]
 * <p>
 * 示例 2:
 * <p>
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * <p>
 * 说明:
 * <p>
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 * @Date 2019-09-29
 * @Version 1.0
 */
public class LeetCode126 {
    public static void main(String[] args) {
        int[] array = {-1, -100, 3, 99};
        int k = 3;
        moveArray(array, k);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * 方法一： 直接转换
     *
     * @param array
     * @param k
     */
    private static void moveArray(int[] array, int k) {
        int length = array.length;
        int[] tmp = new int[length];
        for (int i = 0; i < length; i++) {
            tmp[(i + k) % length] = array[i];
        }

        for (int i = 0; i < length; i++) {
            array[i] = tmp[i];
        }
    }

}
