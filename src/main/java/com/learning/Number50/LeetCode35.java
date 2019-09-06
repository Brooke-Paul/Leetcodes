package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * <p>
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * <p>
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * @Date 2019-06-10
 * @Version 1.0
 */
public class LeetCode35 {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6};
        int target = 7;
        System.out.println(findIndexOne(array, target));
        System.out.println(findIndexTwo(array, target));
    }

    /**
     * 方法一 for循环判断索引位置
     *
     * @param array
     * @param target
     * @return
     */
    public static int findIndexOne(int[] array, int target) {
        if (array == null || array.length < 1) {
            return -1;
        }
        int length = array.length - 1;
        int index = 0;
        for (int i = 0; i <= length; i++) {
            if (array[i] == target) {
                index = i;
            } else if (array[length] <= target) {
                index = length + 1;
            } else if (array[i] < target && array[i + 1] >= target) {
                index = i + 1;
            }
        }
        return index;
    }


    /**
     * 方法二 使用二分查找判断index 下标
     *
     * @param array
     * @param target
     * @return
     */
    public static int findIndexTwo(int[] array, int target) {
        if (array == null || array.length < 1) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;

        int index = binarySearch(array, target, left, right);
        return index;
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return left;
        }

        int mid = (left + right) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearch(array, target, left, mid - 1);
        } else {
            return binarySearch(array, target, mid + 1, right);
        }
    }


}
