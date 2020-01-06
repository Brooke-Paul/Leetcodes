package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description:给定一个正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * <p>
 * 注意： 不要使用任何内置的库函数，如 sqrt 。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 16
 * <p>
 * 输出： True
 * <p>
 * 示例 2：
 * <p>
 * 输入： 14
 * <p>
 * 输出： False
 * <p>
 * 归功于:
 * <p>
 * 特别感谢 @elmirap 添加此问题并创建所有测试用例
 * <p>
 * Created by xuetao on 2020/1/6
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode256 {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }

    private static boolean sqrt(int num) {
        long i = 1;
        long temp = 1;
        while (temp < num) {
            i += 2;
            temp += i;
        }
        return temp == num;
    }
}
