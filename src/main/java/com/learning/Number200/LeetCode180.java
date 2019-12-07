package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:给定一个整数数组 nums ，求出数组从索引 i 到 j ( i ≤ j ) 范围内元素的总和，包含 i,  j 两点。
 * <p>
 * 示例：
 * <p>
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为sumRange()
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * <p>
 * 说明:
 * <p>
 * 你可以假设数组不可变。
 * 会多次调用 sumRange 方法。
 * <p>
 * Created by xuetao on 2019/12/7
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode180 {
    public static void main(String[] args) {
        int[] array = {-2, 0, 3, -5, 2, -1};
        int start = 0;
        int end = 8;
        System.out.println(sumRange(array, start, end));
    }

    private static int sumRange(int[] array, int start, int end) {
        int sum = 0;
        if (end >= array.length) {
            end = array.length - 1;
        }
        for (int j = start; j <= end; j++) {
            sum += array[j];
        }
        return sum;
    }
}
