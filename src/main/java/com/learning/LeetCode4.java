package com.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 1.给定两个大小为m和n的有序数组num1， num2，请找出两个有序数组的中位数，要求算法的时间复杂度为O(log(m+n))
 * 示例：
 * num1 = [1, 2, 5, 7]
 * num2 = [3, 4, 6]
 * 中位数为4.0
 * @Date 2019-04-18
 * @Version 1.0
 */
public class LeetCode4 {


    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        // to ensure m<=n
        if (m > n) {
            int[] temp = A;
            A = B;
            B = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j - 1] > A[i]) {
                // i is too small
                iMin = iMin + 1;
            } else if (i > iMin && A[i - 1] > B[j]) {
                // i is too big
                iMax = iMax - 1;
            } else { // i is perfect
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 5, 7};
        int[] num2 = new int[]{3, 4, 6};
        System.out.println(findMedianSortedArrays(num1, num2));


    }


}
