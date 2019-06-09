package com.learning;

/**
 * @Author xuetao
 * @Description: 给定一个按照升序排列的整数数组 nums ，和一个目标值 target 。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 你的算法时间复杂度必须是 O (log n ) 级别。
 * <p>
 * 如果数组中不存在目标值，返回 [-1, -1] 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 * @Date 2019-06-08
 * @Version 1.0
 */
public class LeetCode34 {

    /**
     * 二分查找
     */
    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 10};
        int target = 10;
        int index = binarySearch(array, target, 0, array.length - 1);
        int[] result = {-1, -1};
        if (index != -1) {
            int left = index;
            int right = index;
            while (left >= 0 && array[left] == target) {
                left--;
            }
            while (right < array.length && array[right] == target) {
                right++;
            }
            result[0] = left + 1;
            result[1] = right - 1;
        }
        System.out.println("left ===" + result[0] + " right===" + result[1]);
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1;
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
