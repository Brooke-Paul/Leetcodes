package com.learning.Number50;


/**
 * @Author xuetao
 * @Description: 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * <p>
 * 示例:
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 * 从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * <p>
 * 说明:
 * <p>
 * 假设你总是可以到达数组的最后一个位置。
 * @Date 2019-06-25
 * @Version 1.0
 */
public class LeetCode45 {
    /**
     * 思路：最少跳跃次数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 3, 2, 7, 1};
        System.out.println(jumpNumber(array));
    }


    public static int jumpNumber(int[] array) {
        int step = 0;
        int lastJump = 0;
        int currentJump = 0;
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            currentJump = Math.max(currentJump, i + array[i]);
            if (i == lastJump) {
                lastJump = currentJump;
                step++;
            }
        }
        return step;
    }

}
