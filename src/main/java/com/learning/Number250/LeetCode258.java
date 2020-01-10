package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 你的任务是计算 a b 对 1337 取模， a 是一个正整数， b 是一个非常大的正整数且会以数组形式给出。
 * <p>
 * 示例 1:
 * <p>
 * a = 2
 * b = [3]
 * <p>
 * 结果: 8
 * <p>
 * 示例 2:
 * <p>
 * a = 2
 * b = [1,0]
 * <p>
 * 结果: 1024
 * <p>
 * 致谢：
 * <p>
 * 特别感谢 @Stomach_ache 添加这道题并创建所有测试用例。
 * <p>
 * Created by xuetao on 2020/1/8
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode258 {
    public static void main(String[] args) {
        int a = 2;
        int b[] = {3};
        System.out.println(superPow(a, b));
    }

    private static int superPow(int a, int[] b) {
        int res = 1;
        for (int i = 0; i < b.length; ++i) {
            res = pow(res, 10) * pow(a, b[i]) % 1337;
        }
        return res;
    }

    private static int pow(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x % 1337;
        return pow(x % 1337, n / 2) * pow(x % 1337, n - n / 2) % 1337;
    }
}
