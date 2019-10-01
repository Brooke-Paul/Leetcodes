package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为 汉明重量 ）。
 * <p>
 * 示例 :
 * <p>
 * 输入: 11
 * 输出: 3
 * 解释: 整数 11 的二进制表示为 **00000000000000000000000000001011**
 * <p>
 * 示例 2:
 * <p>
 * 输入: 128
 * 输出: 1
 * 解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 * @Date 2019-10-01
 * @Version 1.0
 */
public class LeetCode128 {
    public static void main(String[] args) {
        int n = 11;
        int m = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) != 0) {
                m++;
            }
            n >>= 1;
        }
        System.out.println(m);
    }
}
