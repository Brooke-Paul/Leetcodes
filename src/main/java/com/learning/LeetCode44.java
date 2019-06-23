package com.learning;

/**
 * @Author xuetao
 * @Description: 给定一个字符串 ( s ) 和一个字符模式 ( p ) ，实现一个支持 '?' 和 '*' 的通配符匹配。
 * <p>
 * '?' 可以匹配任何单个字符。
 * '*' 可以匹配任意字符串（包括空字符串）。
 * <p>
 * 两个字符串 完全匹配 才算匹配成功。
 * <p>
 * 说明:
 * <p>
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 * 。
 * 示例 1:
 * <p>
 * 输入:
 * s = "aa"
 * p = "a"
 * 输出: false
 * 解释: "a" 无法匹配 "aa" 整个字符串。
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * s = "aa"
 * p = ""
 * 输出: true
 * 解释: '' 可以匹配任意字符串。
 * <p>
 * 示例 3:
 * <p>
 * 输入:
 * s = "cb"
 * p = "?a"
 * 输出: false
 * 解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
 * <p>
 * 示例 4:
 * <p>
 * 输入:
 * s = "adceb"
 * p = "*a*b"
 * 输出: true
 * 解释: 第一个 '' 可以匹配空字符串, 第二个 '' 可以匹配字符串 "dce".
 * <p>
 * 示例 5:
 * <p>
 * 输入:
 * s = "acdcb"
 * p = "a*c?b"
 * 输入: false
 * @Date 2019-06-23
 * @Version 1.0
 */
public class LeetCode44 {
    public static void main(String[] args) {
        String s = "acdcb";
        String p = "a*";
        System.out.println(isMatch(s, p));
    }

    public static boolean isMatch(String s, String p) {
        boolean[][] match = new boolean[s.length() + 1][p.length() + 1];
        match[s.length()][p.length()] = true;
        for (int i = p.length() - 1; i >= 0; i--) {
            if (p.charAt(i) != '*') {
                break;
            } else {
                match[s.length()][i] = true;
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = p.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?') {
                    match[i][j] = match[i + 1][j + 1];
                } else if (p.charAt(j) == '*') {
                    match[i][j] = match[i + 1][j] || match[i][j + 1];
                } else {
                    match[i][j] = false;
                }
            }
        }
        return match[0][0];
    }
}
