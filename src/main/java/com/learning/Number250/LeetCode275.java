package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个长度为 n 的整数数组 A 。
 * <p>
 * 假设 B k 是数组 A 顺时针旋转 k 个位置后的数组，我们定义 A 的“旋转函数” F 为：
 * <p>
 * F(k) = 0 * B k [0] + 1 * B k [1] + ... + (n-1) * B k [n-1] 。
 * <p>
 * 计算 F(0), F(1), ..., F(n-1) 中的最大值。
 * <p>
 * 注意:
 * 可以认为 n 的值小于 10 5 。
 * <p>
 * 示例:
 * <p>
 * A = [4, 3, 2, 6]
 * <p>
 * F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
 * F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
 * F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
 * F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
 * <p>
 * 所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
 * <p>
 * Created by xuetao on 2020/1/31
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode275 {
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 6};
        System.out.println(maxRotateFunction(A));
    }

    public static int maxRotateFunction(int[] A) {
        int allSum = 0;
        int len = A.length;
        int current = 0;
        for (int i = 0; i < len; i++) {
            current += i * A[i];
            allSum += A[i];
        }
        int max = current;
        for (int i = len - 1; i >= 1; i--) {
            current = current + allSum - len * A[i];
            System.out.println(current);
            max = Math.max(current, max);
        }
        return max;
    }
}
