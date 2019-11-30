package com.learning.Number200;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n ），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,4,2,2]
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,1,3,4,2]
 * 输出: 3
 * <p>
 * 说明：
 * <p>
 * 不能 更改原数组（假设数组是只读的）。
 * 只能使用额外的 O (1) 的空间。
 * 时间复杂度小于 O ( n 2 ) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 * @Date 2019-11-30
 * @Version 1.0
 */
public class LeetCode174 {
    public static void main(String[] args) throws Exception {
        int[] array = {3, 1, 3, 4, 2};
        System.out.println(findRepeatNum(array));

    }

    private static int findRepeatNum(int[] array) throws Exception {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                return array[i];
            }
            set.add(array[i]);
        }
        throw new Exception();
    }

}
