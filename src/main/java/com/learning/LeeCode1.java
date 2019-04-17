package com.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 1. 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。假设每个输入只对应一个答案，且同样的元素不能被重复利用。
 * nums[3,6,8,10], target = 11, 因为nums[0] + nums[2] = 11,所以返回 [0,2]
 * @Date 2019-04-18
 * @Version 1.0
 */
public class LeeCode1 {
    public static void main(String[] args) {
        int[] nums = {3,6,8,10};
        int target = 11;
        int[] sum1 = twoSum1(nums, target);

        System.out.println(" two'index1 " + sum1[0] + "  " + sum1[1]);
        int[] sum2 = twoSum2(nums, target);

        System.out.println(" two'index2 " + sum2[0] + "  " + sum2[1]);
    }

    /**
     * 方法一
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Illegal initial  nums");
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum");
    }

    /**
     * 方法二
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Illegal initial  nums");
        }
        Map<Integer, Integer> map = new HashMap(8);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int differ = target - nums[i];
            if (map.containsKey(differ)) {
                return new int[]{map.get(differ), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum");
    }

}
