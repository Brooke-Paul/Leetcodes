package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 进阶:
 * <p>
 * 如果你已经实现复杂度为 O( n ) 的解法，尝试使用更为精妙的分治法求解。
 * @Date 2019-07-04
 * @Version 1.0
 */
public class LeetCode53 {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMax(array));
    }

    /**
     * 方法一：硬编码遍历
     * @param array
     * @return
     */
    public static int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
