package com.learning.Number250;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。 您可以假设给定的数字一定存在于数组中。
 * <p>
 * 注意：
 * 数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。
 * <p>
 * 示例:
 * <p>
 * int[] nums = new int[] {1,2,3,3,3};
 * Solution solution = new Solution(nums);
 * <p>
 * // pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。
 * solution.pick(3);
 * <p>
 * // pick(1) 应该返回 0。因为只有nums[0]等于1。
 * solution.pick(1)
 * <p>
 * Created by xuetao on 2020/2/5
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode277 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 3, 3};
        int target = 2;
        System.out.println(pick(nums, target));
    }

    public static int pick(int[] array, int target) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            return 0;
        }
        return list.get(random.nextInt(list.size()));

    }
}
