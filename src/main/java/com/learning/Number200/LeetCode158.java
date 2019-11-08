package com.learning.Number200;

/**
 * @Author xuetao
 * @Description: 给定长度为 n 的整数数组 nums ，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: [24,12,8,6]
 * <p>
 * 说明: 请 不要使用除法， 且在 O( n ) 时间复杂度内完成此题。
 * <p>
 * 进阶：
 * 你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组 不被视为 额外空间。）
 * @Date 2019-11-08
 * @Version 1.0
 */
public class LeetCode158 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] result = findProduct(array);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }


    private static int[] findProduct(int[] array) {
        int length = array.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int x = 1;
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                x *= array[j];
            }
            result[i] = x;
        }
        return result;
    }
}
