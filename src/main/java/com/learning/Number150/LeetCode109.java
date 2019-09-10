package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,3,-2,4]
 * 输出: 6
 * 解释: 子数组 [2,3] 有最大乘积 6。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [-2,0,-1]
 * 输出: 0
 * 解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。
 * @Date 2019-09-10
 * @Version 1.0
 */
public class LeetCode109 {

    public static void main(String[] args) {
        int[] array = {2, 3, -2, 4, 8, 9};
        System.out.println(maxProduct(array));
    }

    private static int maxProduct(int[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i] * array[i - 1]);
        }
        return max;
    }
}
