package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 实现pow（x，n），它计算x增加到幂n（xn）。
 * <p>
 * 例1：
 * <p>
 * Input: 2.00000, 10
 * Output: 1024.00000
 * 例2：
 * <p>
 * Input: 2.10000, 3
 * Output: 9.26100
 * 例3：
 * <p>
 * Input: 2.00000, -2
 * Output: 0.25000
 * Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25
 * 注意：
 * <p>
 * -100.0 < x <100.0
 * Ñ是一个32位有符号整数，范围[-2内31 2 31 - 1]
 * @Date 2019-07-01
 * @Version 1.0
 */
public class LeetCode50 {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(pow(x, n));
    }

    public static double pow(double x, int n) {
        if (-100 > x || x > 100) {
            throw new IllegalArgumentException("the parameters are Non-standard, parameter must in (-100,100)");
        }
        if (n > Integer.MAX_VALUE || n < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("the parameters are Non-standard,parameter must in (-2^31,2^31-1)");
        }

        if (n < 0) {
            return sum(1 / x, -n);
        } else {
            return sum(x, n);
        }

    }

    /**
     * 使用 x*=x，发现通过率比较低, 所以采用递归方法
     * @param x
     * @param n
     * @return
     */
    public static double sum(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            double m = sum(x, n >> 1);
            return m * m * (n % 2 != 0 ? x : 1);

        }

    }

}
