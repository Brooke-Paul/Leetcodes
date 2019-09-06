package com.learning.Number50;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 实现 atoi ，将字符串转为整数。
 * <p>
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * <p>
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 * <p>
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 * <p>
 * 若函数不能执行有效的转换，返回 0。
 * <p>
 * 说明：
 * <p>
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2 31 ,  2 31 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (2 31 − 1) 或 INT_MIN (−2 31 ) 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "42"
 * 输出: 42
 * <p>
 * 示例 2:
 * <p>
 * 输入: " -42"
 * 输出: -42
 * 解释: 第一个非空白字符为 '-', 它是一个负号。
 * 我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。
 * <p>
 * 示例 3:
 * <p>
 * 输入: "4193 with words"
 * 输出: 4193
 * 解释: 转换截止于数字 '3' ，因为它的下一个字符不为数字。
 * <p>
 * 示例 4:
 * <p>
 * 输入: "words and 987"
 * 输出: 0
 * 解释: 第一个非空字符是 'w', 但它不是数字或正、负号。
 * 因此无法执行有效的转换。
 * <p>
 * 示例 5:
 * <p>
 * 输入: "-91283472332"
 * 输出: -2147483648
 * 解释: 数字 "-91283472332" 超过 32 位有符号整数范围。
 * 因此返回 INT_MIN (−231) 。
 * @Date 2019-04-29
 * @Version 1.0
 */
public class LeetCode8 {
    public static void main(String[] args) {
        String s = "-2-222r22d22222222222222";
        System.out.println(myAtoi(s));
    }


    public static long myAtoi(String str) {
        long result = 0;
        //第一步：判断字符串是否为空
        if (str.isEmpty()) {
            return 0;
        }
        // 第二步： 组装数字集合 0~9
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < 10; i++) {
            set.add(i + "");
        }
        //第三步：删除字符串的头尾空白符
        str = str.trim();
        char[] chars = str.toCharArray();
        int s = chars.length;
        boolean sign = true;

        for (int i = 0; i < s; i++) {
            // 第四步判断是否为数字
            if (set.contains(String.valueOf(chars[i]))) {
                result = result * 10 + Integer.valueOf(String.valueOf(chars[i]));
            } else {
                //判断首位字符是否为+-号，否则退出循环
                if ("-".equals(String.valueOf(chars[i])) && i == 0) {
                    sign = false;
                } else if ("+".equals(String.valueOf(chars[i])) && i == 0) {
                    sign = true;
                } else {
                    break;
                }

            }
        }
        long num = sign ? result : -result;
        if (num > Integer.MAX_VALUE) {
            num = Integer.MAX_VALUE;
            System.out.println(1);
            return num;
        }
        if (num < Integer.MIN_VALUE) {
            num = Integer.MIN_VALUE;
            System.out.println(-1);
            return num;
        }
        if (!sign) {
            result = -result;
        }
        return result;
    }
}
