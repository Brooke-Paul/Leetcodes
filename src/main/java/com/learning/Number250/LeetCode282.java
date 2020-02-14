package com.learning.Number250;

import java.util.HashSet;
import java.util.Set;

/**
 * Program Name: com.learning.Number250
 * Description:
 * <p>
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 * <p>
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 * <p>
 * 注意:
 * 假设字符串的长度不会超过 1010。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "abccccdd"
 * <p>
 * 输出:
 * 7
 * <p>
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 * Created by xuetao on 2020/2/14
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode282 {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int result = 0;
        Set<Character> count = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (count.contains(s.charAt(i))) {
                result++;
                count.remove(s.charAt(i));
            } else {
                count.add(s.charAt(i));
            }
        }
        if (!count.isEmpty()) {
            return result * 2 + 1;
        }
        return result * 2;
    }

}
