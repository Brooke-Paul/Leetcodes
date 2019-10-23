package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 给定一个整数数组和一个整数 k ，判断数组中是否存在两个不同的索引 i 和 j ，使得 nums [i] = nums [j] ，并且 i 和 j 的差的绝对值最大为 k 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * <p>
 * 示例 3:
 * <p>
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 * @Date 2019-10-23
 * @Version 1.0
 */
public class LeetCode145 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1};
        int target = 5;
        System.out.println(equalsAbsolute(array, target));
    }

    /**
     * 下标之差 == target
     *
     * @param array
     * @param target
     * @return
     */
    private static boolean equalsAbsolute(int[] array, int target) {
        if (array == null || array.length == 0) {
            return false;
        }

        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len; j++) {
                if (array[i] == array[j] && j - i <= target) {
                    return true;
                }
            }
        }
        return false;
    }
}
