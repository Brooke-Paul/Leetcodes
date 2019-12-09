package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:给定一个整数数组 nums ，求出数组从索引 i 到 j ( i ≤ j ) 范围内元素的总和，包含 i,  j 两点。
 * <p>
 * update(i, val) 函数可以通过将下标为 i 的数值更新为 val ，从而对数列进行修改。
 * <p>
 * 示例:
 * <p>
 * Given nums = [1, 3, 5]
 * <p>
 * sumRange(0, 2) -> 9
 * update(1, 2)
 * sumRange(0, 2) -> 8
 * <p>
 * 说明:
 * <p>
 * 数组仅可以在 update 函数下进行修改。
 * 你可以认为调用 update 函数和 sumRange 函数的次数是相等的。
 * <p>
 * Created by xuetao on 2019/12/9
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode182 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5};
        System.out.println(sumRange(array, 0, 2));
        update(array, 1, 2);
        System.out.println(sumRange(array, 0, 2));
    }

    private static int sumRange(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static void update(int[] array, int index, int value) {
        array[index] = value;
    }
}
