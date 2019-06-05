package com.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "(()"
 * 输出: 2
 * 解释: 最长有效括号子串为 "()"
 * <p>
 * 示例 2:
 * <p>
 * 输入: ")()())"
 * 输出: 4
 * 解释: 最长有效括号子串为 "()()"
 * @Date 2019-06-05
 * @Version 1.0
 */
public class LeetCode32 {
    /**
     * 利用map 判断 明日解决
     *
     * @param args
     */
    public static void main(String[] args) {
        String string = "()((()()()()()()())(()";
        System.out.println(validString(string));
    }

    public static int validString(String string) {
        if (string == null || string.length() < 1) {
            return 0;
        }
        int s = 0;
        int sum = 0;
        int length = string.length();
        for (int i = 0; i < length; ) {
            if (string.charAt(i) == '(' && string.charAt(i + 1) == ')') {
                s += 2;
                i += 2;
            } else if (s != 0) {
                sum = Math.max(s, sum);
                s = 0;
                i++;
            } else {
                i++;
            }

        }
        return sum;
    }

}
