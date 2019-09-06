package com.learning.Number100;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * <p>
 * 示例 2:
 * <p>
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * @Date 2019-07-22
 * @Version 1.0
 */
public class LeetCode67 {

    public static void main(String[] args) {
        String a = "1111";
        String b = "1";

        int aLen = a.length();
        int bLen = b.length();
        int max = aLen >= bLen ? aLen : bLen;
        int min = aLen <= bLen ? aLen : bLen;
        StringBuffer stringBuffer = new StringBuffer();
        boolean result = false;
        while (max > 0 || min > 0) {
            int x = 0;
            int y = 0;
            if (max > 0) {
                x = a.charAt(--max) - '0';
            }
            if (min > 0) {
                y = b.charAt(--min) - '0';
            }
            int m = x + y + (result == true ? 1 : 0);
            if (m >= 2) {
                m = m % 2;
                result = true;
            } else {
                m = m % 2;
                result = false;
            }
            stringBuffer.append(m);
        }
        if (result) {
            stringBuffer.append(1);
        }

        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.reverse().toString());
    }
}
