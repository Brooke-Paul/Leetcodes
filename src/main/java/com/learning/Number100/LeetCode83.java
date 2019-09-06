package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * <p>
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * <p>
 * <p>
 * <p>
 * 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3] 。
 * <p>
 * <p>
 * <p>
 * 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。
 * <p>
 * 示例:
 * <p>
 * 输入: [2,1,5,6,2,3]
 * 输出: 10
 * @Date 2019-08-12
 * @Version 1.0
 */
public class LeetCode83 {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 6, 2, 3};
        System.out.println(rectangle(array));
    }

    private static int rectangle(int[] array) {
        int length = array.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                max = Math.max(Math.min(array[i], array[j]) * (j - i), max);
            }
        }
        return max;
    }
}
