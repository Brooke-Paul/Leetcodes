package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个包含 n 个整数的数组 nums 和一个目标值 target ，判断 nums 中是否存在四个元素 a， b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：
 * <p>
 * 答案中不可以包含重复的四元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 * <p>
 * 满足要求的四元组集合为：
 * [
 * [-1, 0, 0, 1],
 * [-2, -1, 1, 2],
 * [-2, 0, 0, 2]
 * ]
 * @Date 2019-05-14
 * @Version 1.0
 */
public class LeetCode18 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        fourNum(nums, target);
    }


    /**
     * 第一步：数组长度校验
     * 第二步：数组排序
     * 第三步：数组去重
     * 第四步：数组去掉多余的循环
     *
     * @param nums
     * @param target
     */
    public static void fourNum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return;
        }
        int i, j, x, y;

        int length = nums.length;

        Arrays.sort(nums);
        for (i = 0; i < length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break;
            }
            if (nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue;
            }


            for (j = i + 1; j < length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                x = j + 1;
                y = length - 1;

                while (x < y) {
                    int sum = nums[i] + nums[j] + nums[x] + nums[y];
                    if (sum < target) {
                        x++;
                    } else if (sum > target) {
                        y--;
                    } else {
                        List<Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[x]);
                        list.add(nums[y]);
                        System.out.println(list);
                        while (x + 1 < y && nums[x + 1] == nums[x]) {
                            x++;
                        }
                        while (y - 1 > x && nums[y - 1] == nums[y]) {
                            y--;
                        }
                        x++;
                        y--;
                    }
                }
            }
        }
    }
}
