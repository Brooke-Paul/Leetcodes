package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j ，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t ，并且 i 和 j 之间的差的绝对值最大为 ķ 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3, t = 0
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1, t = 2
 * 输出: true
 * <p>
 * 示例 3:
 * <p>
 * 输入: nums = [1,5,9,1,5,9], k = 2, t = 3
 * 输出: false
 * @Date 2019-10-24
 * @Version 1.0
 */
public class LeetCode146 {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 1, 5, 9};
        int k = 2;
        int t = 3;
        System.out.println(containsNearBy(array, k, t));
    }


    private static boolean containsNearBy(int[] array, int k, int t) {
        if (array == null || array.length == 0) {
            return false;
        }
        int len = array.length;


        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Math.abs(array[i] - array[j]) <= t && j - i <= k) {
                    return true;
                }
            }
        }
        return false;

    }
}
