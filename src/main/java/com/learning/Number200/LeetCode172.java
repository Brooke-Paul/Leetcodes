package com.learning.Number200;

/**
 * @Author xuetao
 * @Description: 给定一个数组 nums ，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * <p>
 * 说明 :
 * <p>
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 * @Date 2019-11-27
 * @Version 1.0
 */
public class LeetCode172 {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        moveII(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

    private static void moveI(int[] array) {
        int length = array.length;

        int index = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }
        for (int j = index; j < length; j++) {
            array[j] = 0;
        }
    }

    private static void moveII(int[] array) {
        int length = array.length;

        for (int i = 0, j = 0; i < length && j < length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }


    }
}
