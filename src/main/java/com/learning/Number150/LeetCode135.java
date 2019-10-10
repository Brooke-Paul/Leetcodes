package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 统计所有小于非负整数 n 的质数的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 * @Date 2019-10-10
 * @Version 1.0
 */
public class LeetCode135 {

    public static void main(String[] args) {
        int n = 20;
        System.out.println(primeNumber(n));
    }

    private static int primeNumber(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (findPrimeNumber(i)) {
                count++;
                System.out.print(i + " ");
            }
        }
        return count;
    }

    /**
     * 整除并且不等于1
     *
     * @param num
     * @return
     */
    private static boolean findPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
