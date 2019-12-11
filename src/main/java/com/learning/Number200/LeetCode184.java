package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:  编写一段程序来查找第 _n_ 个超级丑数。
 * <p>
 * 超级丑数是指其所有质因数都在长度为 k 的质数列表 primes 中的正整数。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 12, primes = [2,7,13,19]
 * 输出: 32
 * 解释: [1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32]，是给定长度为 4 的 质数列表 primes = [2,7,13,19]的前 12 个超级丑数。
 * <p>
 * 说明:
 * <p>
 * 1 是任何给定 primes 的超级丑数。
 * 给定 primes 中的数字以升序排列。
 * 0 < k ≤ 100, 0 < n ≤ 10 6 , 0 < primes[i] < 1000 。
 * 第 n 个超级丑数确保在 32 位有符整数的范围内。
 * <p>
 * Created by xuetao on 2019/12/11
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode184 {
    public static void main(String[] args) {
        int[] array = {2, 7, 13, 19};
        System.out.println(nthSuperUglyNumber(12, array));
    }

    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] ret = new int[n];
        ret[0] = 1;

        int[] indexes = new int[primes.length];

        for (int i = 1; i < n; i++) {
            ret[i] = Integer.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                ret[i] = Math.min(ret[i], primes[j] * ret[indexes[j]]);
            }

            for (int j = 0; j < indexes.length; j++) {
                if (ret[i] == primes[j] * ret[indexes[j]]) {
                    indexes[j]++;
                }
            }
        }

        return ret[n - 1];
    }
}
