package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 给定一个字符串s， 找到 s 中最长的回文子串
 * 输入：'babad' 输出 'bab' 或者 'aba'
 * 输入：'cbbd'  输出 'bb'
 * @Date 2019-04-25
 * @Version 1.0
 */
public class LeetCode5 {

    private int lo, maxLen;

    public static void main(String[] args) {
        String str = "caba";
        LeetCode5 leetCode5 = new LeetCode5();
        System.out.println(leetCode5.longgestStr(str));
    }


    public String longgestStr(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int len = s.length();

        for (int i = 0; i < len - 1; i++) {
            // 判断奇数的情况
            extendPalindrome(s, i, i);
            // 判断偶数的情况
            extendPalindrome(s, i, i + 1);
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
