package com.learning;

/**
 * @Author xuetao
 * @Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明： 本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: "race a car"
 * 输出: false
 * @Date 2019-08-29
 * @Version 1.0
 */
public class LeetCode98 {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(chars[i])) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(chars[j])) {
                j--;
            }
            if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
