package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * <p>
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * <p>
 * 请找出其中最小的元素。
 * <p>
 * 你可以假设数组中不存在重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * <p>
 * 示例 2:
 * <p>
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 * @Date 2019-09-11
 * @Version 1.0
 */
public class LeetCode110 {

    public static void main(String[] args) {
        int[] array = {4,5,6,7,0,1,2};
        System.out.println(findMin(array));
    }

    private static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        if (array[left] < array[right]) {
            return array[left];
        }
        int min = array[0];
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            min = Math.min(min, array[mid]);

            if (array[left] < array[mid]) {
                min = Math.min(array[left], min);
                left = mid + 1;
            } else if (array[left] > array[mid]) {
                right = mid - 1;
            }
        }
        min = Math.min(min, Math.min(array[left], array[right]));
        return min;
    }
}
