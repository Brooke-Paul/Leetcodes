package com.learning;

/**
 * @Author xuetao
 * @Description: 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意： 给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1. 1 步 + 1 步
 * 2. 2 步
 * <p>
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1. 1 步 + 1 步 + 1 步
 * 2. 1 步 + 2 步
 * 3. 2 步 + 1 步
 * @Date 2019-07-24
 * @Version 1.0
 */
public class LeetCode69 {
    /**
     * 思路：每一次只能爬一步或者两步, 即d(i)=d(i-1)+d(i-2)
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climb(n));
    }

    private static int climb(int n) {
        int[] result = new int[n];
        result[0] = 1;
        if (n == 1) {
            return 1;
        }
        result[1] = 2;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n - 1];
    }

}
