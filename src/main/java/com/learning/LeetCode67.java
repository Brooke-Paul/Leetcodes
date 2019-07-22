package com.learning;

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
        String a = "11011";
        String b = " 1010";

        int aLen = a.length();
        int bLen = b.length();
        int max = aLen >= bLen ? aLen : bLen;
        int min = aLen <= bLen ? aLen : bLen;
        int[] array = new int[max];
        StringBuffer stringBuffer = new StringBuffer();
        boolean result = false;
        for (int i = min - 1; i >= 0; i--) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i) == '1') {
                stringBuffer.append(0);
                result = true;
            } else {
                int x = a.charAt(i) - '0' + b.charAt(i) - '0' + (result == true ? 1 : 0);
                result = x == 2;
                System.out.println(x);
                stringBuffer.append(result ? 0 : x);
            }
        }

        for (int j = max - min - 1; j >= 0; j--) {
            String x = aLen > bLen ? a : b;

            int n = x.charAt(j) - '0' + (result == true ? 1 : 0);
            result = n == 2;
            System.out.println(n);
            stringBuffer.append(result ? 0 : n);
        }
        if (result == true) {

            stringBuffer.append(1);

        }
        System.out.println(stringBuffer.reverse().toString());
    }
}
