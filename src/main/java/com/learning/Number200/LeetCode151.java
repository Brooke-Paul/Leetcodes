package com.learning.Number200;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个无重复元素的有序整数数组，返回数组区间范围的汇总。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [0,1,2,4,5,7]
 * 输出: ["0->2","4->5","7"]
 * 解释: 0,1,2 可组成一个连续的区间; 4,5 可组成一个连续的区间。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [0,2,3,4,6,8,9]
 * 输出: ["0","2->4","6","8->9"]
 * 解释: 2,3,4 可组成一个连续的区间; 8,9 可组成一个连续的区间
 * @Date 2019-10-31
 * @Version 1.0
 */
public class LeetCode151 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String start = String.valueOf(nums[i]);
            int tmpI = i;
            while ((i + 1) < nums.length && (nums[i] + 1) == nums[i + 1]) {
                i++;
            }
            if (tmpI == i) {
                result.add(start);
            } else {
                result.add(start + "->" + nums[i]);
            }
        }
        return result;
    }

    public static void main(String... args) {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> result = summaryRanges(nums);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
