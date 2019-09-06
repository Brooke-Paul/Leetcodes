package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * <p>
 * <p>
 * <p>
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 * @Date 2019-06-19
 * @Version 1.0
 */
public class LeetCode42 {

    /**
     * 思考：获取最大值
     * 从左递增到最大值获取雨滴
     * 从右递减到最大值获取雨滴
     *
     * @param args
     */
    public static void main(String[] args) {
        int array[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(array));
    }

    public static int trap(int[] array) {
        if (array == null || array.length < 3) {
            return 0;
        }

        int sum = 0;
        int length = array.length;
        int index = 0;
        int max = 0;

        for (int i = 0; i < length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        int left = 0;
        for (int l = 1; l < index; l++) {
            if (left < array[l]) {
                left = array[l];
            } else {
                sum += left - array[l];
            }
        }


        int right = 0;
        for (int r = length - 2; r > index; r--) {
            if (right < array[r]) {
                right = array[r];
            } else {
                sum += right - array[r];
            }
        }
        return sum;

    }
}
