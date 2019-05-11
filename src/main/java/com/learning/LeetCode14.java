package com.learning;

/**
 * @Author xuetao
 * @Description: 题目描述：
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * <p>
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * <p>
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 * @Date 2019-05-11
 * @Version 1.0
 */
public class LeetCode14 {
    public static void main(String[] args) {
        String[] array = {"hhwlower", "flow", "flight"};
        commonPrefix(array);
    }

    public static String commonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];
        if (prefix == null || prefix == "") {
            return "";
        }
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) == -1) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        System.out.println(prefix);
        return prefix;

    }
}
