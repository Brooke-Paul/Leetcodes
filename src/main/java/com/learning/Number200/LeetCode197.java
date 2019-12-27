package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个正整数 n ，将其拆分为 至少 两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * <p>
 * 例如，给定 n = 2，返回1（2 = 1 + 1）；给定 n = 10，返回36（10 = 3 + 3 + 4）。
 * <p>
 * 注意：你可以假设 n 不小于2且不大于58。
 * <p>
 * 感谢：
 * 特别感谢 @jianchao.li.fighter 添加此问题并创建所有测试用例。
 * <p>
 * Created by xuetao on 2019/12/27
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode197 {
    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

    public static int integerBreak(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else if (n % 3 == 0) {
            return (int) Math.pow(3, n / 3);
        } else if (n % 3 == 1) {
            return 2 * 2 * (int) Math.pow(3, (n - 4) / 3);
        } else {
            return 2 * (int) Math.pow(3, n / 3);
        }
    }
}
