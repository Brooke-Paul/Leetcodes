package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 * <p>
 * 你可以假设数组中不存在重复的元素。
 * <p>
 * 你的算法时间复杂度必须是 O (log n ) 级别。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 * @Date 2019-06-06
 * @Version 1.0
 */
public class LeetCode33 {
    /**
     * 找到零界点，二分查找
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        System.out.println(findExistsNum(array, target));
    }

    public static int findExistsNum(int[] array, int target) {
        if (array == null || array.length < 1) {
            return -1;
        }
        int left = 0;
        int right = array.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] >= array[left]) {
                if (array[left] <= target && target < array[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (array[mid] < target && target <= array[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return array[left] == target ? left : -1;
    }
}
