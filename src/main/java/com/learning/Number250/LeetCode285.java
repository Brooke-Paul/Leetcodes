package com.learning.Number250;

/**
 * Program Name: com.learning.Number250
 * Description: 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。
 * <p>
 * 例如，以下数列为等差数列:
 * <p>
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * <p>
 * 以下数列不是等差数列。
 * <p>
 * 1, 1, 2, 5, 7
 * <p>
 * 数组 A 包含 N 个数，且索引从0开始。数组 A 的一个子数组划分为数组 (P, Q)，P 与 Q 是整数且满足 0<=P
 * <p>
 * 如果满足以下条件，则称子数组(P, Q)为等差数组：
 * <p>
 * 元素 A[P], A[p + 1], ..., A[Q - 1], A[Q] 是等差的。并且 P + 1 < Q 。
 * <p>
 * 函数要返回数组 A 中所有为等差数组的子数组个数。
 * <p>
 * 示例:
 * <p>
 * A = [1, 2, 3, 4]
 * <p>
 * 返回: 3, A 中有三个子等差数组: [1, 2, 3], [2, 3, 4] 以及自身 [1, 2, 3, 4]。
 * Created by xuetao on 2020/2/17
 *
 * @author xuetao
 * @version 1.0
 */

public class LeetCode285 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        System.out.println(numberOfArithmeticSlices(array));
    }

    public static int numberOfArithmeticSlices(int[] A) {
        int sum = 0;
        int curr = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                curr++;
                sum += curr;
            } else {
                curr = 0;
            }
        }
        return sum;
    }
}
