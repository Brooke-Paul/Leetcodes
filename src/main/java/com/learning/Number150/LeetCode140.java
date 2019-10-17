package com.learning.Number150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个含有 n 个正整数的数组和一个正整数 s ， 找出该数组中满足其和 ≥ s 的长度最小的子数组 。 如果不存在符合条件的子数组，返回 0。
 * <p>
 * 示例:
 * <p>
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的子数组。
 * <p>
 * 进阶:
 * <p>
 * 如果你已经完成了 O ( n ) 时间复杂度的解法, 请尝试 O ( n log n ) 时间复杂度的解法。
 * @Date 2019-10-15
 * @Version 1.0
 */
public class LeetCode140 {
    public static void main(String[] args) {
        int[] array = {4, 3, 4, 2, 2, 7, 4};
        int s = 7;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> result = findSubArray(map, array, s, Integer.MAX_VALUE);
        System.out.println(result);
        System.out.println(findSubArrayLen(s, array));

    }

    private static List<Integer> findSubArray(Map<Integer, List<Integer>> map, int[] array, int s, int min) {
        for (int j = 0; j < array.length; j++) {
            List<Integer> list = new ArrayList<>();
            list.add(array[j]);
            min = findNext(map, list, array, s, j + 1, min);
        }
        return map.get(min);
    }


    private static int findNext(Map<Integer, List<Integer>> map, List<Integer> list, int[] array, int s, int i, int min) {
        if (list.size() > 0) {
            int result = list.stream().mapToInt(Integer::intValue).sum();
            if (result >= s && result <= min) {
                min = Math.min(result, min);
                if (map.get(result) == null) {
                    map.put(min, new ArrayList<>(list));
                } else if (map.get(result).size() > list.size()) {
                    map.put(min, new ArrayList<>(list));
                }
                return min;
            } else if (result >= s && result > min) {
                return min;
            }
        }
        for (int j = i; j < array.length; j++) {
            list.add(array[j]);
            min = findNext(map, list, array, s, j + 1, min);
            list.remove(list.size() - 1);
        }
        return min;
    }

    private static int findSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while (j < nums.length) {
            sum += nums[j++];

            while (sum >= s) {
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
