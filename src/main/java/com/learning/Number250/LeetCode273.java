package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * <p>
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * <p>
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如， "ace" 是 "abcde" 的一个子序列，而 "aec" 不是）。
 * <p>
 * 示例 1:
 * s = "abc" , t = "ahbgdc"
 * <p>
 * 返回 true .
 * <p>
 * 示例 2:
 * s = "axc" , t = "ahbgdc"
 * <p>
 * 返回 false .
 * <p>
 * 后续挑战 :
 * <p>
 * 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 * <p>
 * 致谢:
 * <p>
 * 特别感谢 @pbrother 添加此问题并且创建所有测试用例。
 * <p>
 * Created by xuetao on 2020/1/28
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode273 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(subsequence(s, t));
    }

    private static boolean subsequence(String s, String t) {
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = left;
            boolean check = false;
            for (; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    left = j + 1;
                    check = true;
                    break;
                }
            }
            if (j == t.length() && !check) {
                return false;
            }
        }
        return true;
    }


}
