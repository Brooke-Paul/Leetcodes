package com.learning.Number200;

import java.util.Arrays;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个无序的数组 nums ，将它重新排列成 nums[0] < nums[1] > nums[2] < nums[3]... 的顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1, 5, 1, 1, 6, 4]
 * 输出: 一个可能的答案是 [1, 4, 1, 5, 1, 6]
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [1, 3, 2, 2, 3, 1]
 * 输出: 一个可能的答案是 [2, 3, 1, 3, 1, 2]
 * <p>
 * 说明:
 * 你可以假设所有输入都会得到有效的结果。
 * <p>
 * 进阶:
 * 你能用 O(n) 时间复杂度和/或原地 O(1) 额外空间来实现吗？
 * <p>
 * Created by xuetao on 2019/12/15
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode188 {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 2, 3, 1};
        wiggleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void wiggleSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[i] = nums[i];
        }
        Arrays.sort(tmp);
        int i = 0, j = nums.length / 2;
        for (int k = 0; k < nums.length; k++) {
            nums[k] = (k & 1) > 0 ? tmp[j++] : tmp[i++];
        }
    }
}
