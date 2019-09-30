package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 颠倒给定的 32 位无符号整数的二进制位。
 * <p>
 * 示例:
 * <p>
 * 输入: 43261596
 * 输出: 964176192
 * 解释: 43261596 的二进制表示形式为 00000010100101000001111010011100 ，
 * 返回 964176192，其二进制表示形式为 00111001011110000010100101000000 。
 * <p>
 * 进阶 :
 * 如果多次调用这个函数，你将如何优化你的算法？
 * @Date 2019-09-30
 * @Version 1.0
 */
public class LeetCode127 {
    public static void main(String[] args) {
        int num = 43261596;
        transferBinaryI(num);
    }


    private static void transferBinaryI(int num) {
        long res = 0;
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= num & 1;
            num >>>= 1;
        }
        System.out.println(res);
    }
}
