package com.learning;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定一个包括 n 个整数的数组 nums 和 一个目标值 target 。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 * <p>
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 * <p>
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 * @Date 2019-05-13
 * @Version 1.0
 */
public class LeetCode16 {


    /**
     * 思路：
     * 1.将数组排序。
     * 2.将三个数相加求与目标值target的差的绝对值。
     * 3.获取最小的绝对值。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = -3;
        System.out.println(threeNumClosest(nums, target));
    }

    public static int threeNumClosest(int[] nums, int target) {

        int length = nums.length;
        if (length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int i, j = 0, m = 0, compare, result = 0;
        for (i = 0; i < length - 2; i++) {
            j = i + 1;
            m = length - 1;
            while (j < m) {
                compare = nums[i] + nums[j] + nums[m];
                if (Math.abs(compare - target) < min) {
                    min = Math.abs(compare - target);
                    result = compare;
                }
                //三数和大于目标值，m左移， 反之三数和小于目标值，j 右移
                if (compare > target) {
                    m--;
                } else if (compare < target) {
                    j++;
                } else {
                    return target;
                }
            }

        }
        return result;
    }
}
