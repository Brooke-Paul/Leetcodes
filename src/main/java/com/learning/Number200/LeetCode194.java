package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个非负整数 num 。 对于范围 0 ≤ i ≤ num 中的每个数字 i ，计算其二进制数中的1的数目并将它们作为数组返回。
 * <p>
 * 示例：
 * 比如给定 num = 5 ，应该返回 [0,1,1,2,1,2] .
 * <p>
 * 进阶：
 * <p>
 * 给出时间复杂度为 O(n * sizeof(integer)) 的解答非常容易。 但是你可以在线性时间 O(n) 内用一次遍历做到吗？
 * 要求算法的空间复杂度为 O(n) 。
 * 你能进一步完善解法吗？ 在c ++或任何其他语言中不使用任何内置函数（如c++里的 __builtin_popcount ）来执行此操作。
 * 致谢：
 * 特别感谢 @syedee 添加此问题及所有测试用例。
 * <p>
 * Created by xuetao on 2019/12/23
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode194 {
    public static void main(String[] args) {
        int[] array = countBits(5);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] countBits(int num) {
        int[] array = new int[num + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = count(i);
        }
        return array;
    }

    private static int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num &= num - 1;
        }
        return count;
    }
}
