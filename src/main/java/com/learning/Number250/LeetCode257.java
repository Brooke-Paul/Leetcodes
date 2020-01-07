package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 不使用 运算符 + 和 - ，计算两整数 a 、 b 之和。
 * <p>
 * 示例：
 * 若 a = 1 ， b = 2，返回 3。
 * <p>
 * 致谢：
 * 特别感谢 @fujiaozhu 添加这道问题并创建测试用例。
 * <p>
 * Created by xuetao on 2020/1/7
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode257 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }

    private static int sum(int i, int j) {
        if (j == 0) {
            return i;
        }

        int sum = i ^ j;
        int carry = (i & j) << 1;
        return sum(sum, carry);
    }
}
