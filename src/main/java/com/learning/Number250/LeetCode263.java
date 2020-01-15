package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个由正整数组成且不存在重复数字的数组，找出和为给定目标正整数的组合的个数。
 * <p>
 * 示例:
 * <p>
 * nums = [1, 2, 3]
 * target = 4
 * <p>
 * 所有可能的组合为：
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * <p>
 * 请注意，顺序不同的序列被视作不同的组合。
 * <p>
 * 因此输出为 7。
 * <p>
 * 进阶：
 * 如果给定的数组中含有负数会怎么样？
 * 问题会产生什么变化？
 * 我们需要在题目中添加什么限制来允许负数的出现？
 * <p>
 * 致谢：
 * 特别感谢 @pbrother 添加此问题并创建所有测试用例。
 * <p>
 * Created by xuetao on 2020/1/15
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode263 {
    private static int count = 0;

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int target = 4;
        findNumber(array, target);
        System.out.println(count);
    }

    private static void findNumber(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            dps(nums, length, target - nums[i]);
        }

    }

    private static void dps(int[] nums, int length, int target) {
        if (target == 0) {
            count++;
            return;
        }
        for (int j = 0; j < length; j++) {
            if (target - nums[j] >= 0) {
                dps(nums, length, target - nums[j]);
            }
        }
    }
}
