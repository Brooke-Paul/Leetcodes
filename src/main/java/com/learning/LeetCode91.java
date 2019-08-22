package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定三个字符串 s1 , s2 , s3 , 验证 s3 是否是由 s1 和 s2 交错组成的。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
 * 输出: false
 * @Date 2019-08-22
 * @Version 1.0
 */
public class LeetCode91 {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";

        System.out.println(combination(s1, s2, s3));
    }


    private static boolean combination(String s1, String s2, String s3) {
        // 第一步：判断长度是否相等
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        boolean[][] path = new boolean[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) {
                    path[i][j] = true;
                } else if (i == 0) {
                    path[i][j] = path[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(j - 1));
                } else if (j == 0) {
                    path[i][j] = path[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i - 1));
                } else {
                    path[i][j] = (path[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(i + j - 1))) || (path[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(i + j - 1)));
                }
            }
        }
        return path[s1.length()][s2.length()];
    }
}
