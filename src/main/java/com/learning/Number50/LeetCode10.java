package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 给定一个字符串 ( s ) 和一个字符模式 ( p )。实现支持 '.' 和 '*' 的正则表达式匹配。
 * <p>
 * '.' 匹配任意单个字符。
 * '*' 匹配零个或多个前面的元素。
 * <p>
 * 匹配应该覆盖 整个 字符串 ( s ) ，而不是部分字符串。
 * <p>
 * 说明:
 * <p>
 * s 可能为空，且只包含从 a-z 的小写字母。
 * p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 * 。
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
 * p = "a*"
 * 输出: true
 * 解释: '*' 代表可匹配零个或多个前面的元素, 即可以匹配 'a' 。因此, 重复 'a' 一次, 字符串可变为 "aa"。
 * <p>
 * 示例 3:
 * <p>
 * 输入:
 * s = "ab"
 * p = "."
 * 输出: true
 * 解释: "." 表示可匹配零个或多个('*')任意字符('.')。
 * <p>
 * 示例 4:
 * <p>
 * 输入:
 * s = "aab"
 * p = "c*a*b"
 * 输出: true
 * 解释: 'c' 可以不被重复, 'a' 可以被重复一次。因此可以匹配字符串 "aab"。
 * <p>
 * 示例 5:
 * <p>
 * 输入:
 * s = "mississippi"
 * p = "mis*is*p*."
 * 输出: false
 * @Date 2019-05-05
 * @Version 1.0
 */
public class LeetCode10 {
    public static boolean isMatch(String text, String pattern) {
        //如果都为空则匹配成功
        if (pattern.isEmpty()) {
            return text.isEmpty();
        }
        //第一个是否匹配上
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));
        // pattern 包含 * 的情况
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            // pattern 不包含 * 的情况，如果第一个字符相等， s和p同时向右移动一位看是否仍然能匹配成功
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aab", "..a*b"));
        System.out.println(isMatch("mississippi", "mis*is*p*."));
    }
}
