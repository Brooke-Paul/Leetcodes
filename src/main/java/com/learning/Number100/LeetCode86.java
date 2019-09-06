package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 给定两个有序整数数组 nums1 和 nums2 ，将 nums2 合并到 nums1 中 ， 使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n ）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6], n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * @Date 2019-08-17
 * @Version 1.0
 */
public class LeetCode86 {
    public static void main(String[] args) {
        int[] num1 = {4, 5, 6, 0, 0, 0};
        int[] num2 = {1, 2, 3};
        int m = 3;
        int n = 3;
        merge(num1, m, num2, n);
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
