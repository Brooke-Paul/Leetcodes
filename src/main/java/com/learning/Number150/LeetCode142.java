package com.learning.Number150;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
 * 输出: 4
 * <p>
 * 说明:
 * <p>
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 * @Date 2019-10-20
 * @Version 1.0
 */
public class LeetCode142 {
    public static void main(String[] args) {
        int[] array = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        System.out.println(bigK(array, k));

    }

    private static int bigK(int[] array, int k) {
        Arrays.sort(array);
        return array[array.length - k];
    }
}
