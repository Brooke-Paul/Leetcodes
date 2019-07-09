package com.learning;

/**
 * @Author xuetao
 * @Description: 给定一个非负整数数组，你最初位于数组的第一个位置。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个位置。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 * @Date 2019-07-08
 * @Version 1.0
 */
public class LeetCode55 {
    public static void main(String[] args) {
        int[] array = {1, 4, 0, 1, 4};
        System.out.println(jump(array, 0, array.length));
        System.out.println(jump(array));
    }

    /**
     * 嵌套求下标和 是否等于length
     *
     * @param array
     * @param index
     * @param length
     * @return
     */
    public static boolean jump(int[] array, int index, int length) {
        boolean result = false;
        if (index == length - 1) {
            result = true;
            return result;
        }
        for (int i = index; i < length; i++) {
            int arrayIndex = i + array[i];
            if (arrayIndex == 0 || array[i] == 0) {
                continue;
            }
            result = jump(array, arrayIndex, length);
            if (result) {
                break;
            }
        }

        return result;
    }


    /**
     * 简化 方法一
     * 判断当前索引之和
     *
     * @param array
     * @return
     */
    public static boolean jump(int[] array) {
        int length = array.length;
        int target = array[0];
        for (int i = 0; i < length; i++) {
            if (i <= target && array[i] + i > target) {
                target = array[i] + i;
            }
        }
        return target >= length - 1;
    }
}
