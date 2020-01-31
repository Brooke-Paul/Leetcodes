package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 找到给定字符串（由小写字符组成）中的最长子串 T ， 要求 T 中的每一字符出现次数都不少于 k 。输出 T 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * s = "aaabb", k = 3
 * <p>
 * 输出:
 * 3
 * <p>
 * 最长子串为 "aaa" ，其中 'a' 重复了 3 次。
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * s = "ababbc", k = 2
 * <p>
 * 输出:
 * 5
 * <p>
 * 最长子串为 "ababb" ，其中 'a' 重复了 2 次， 'b' 重复了 3 次。
 * <p>
 * Created by xuetao on 2020/1/29
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode274 {

    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;
        System.out.println(longestSubstring(s, k));
    }

    public static int longestSubstring(String s, int k) {
        return findLongestSubstring(s.toCharArray(), 0, s.length(), k);
    }

    public static int findLongestSubstring(char[] chars, int start, int end, int k) {

        if (end - start < k) {
            return 0;
        }
        int[] count = new int[26];
        for (int i = start; i < end; i++) {
            int index = chars[i] - 'a';
            count[index]++;
        }


        for (int i = 0; i < 26; i++) {
            if (count[i] < k && count[i] > 0) {
                for (int j = start; j < end; j++) {
                    if (chars[j] == i + 'a') {
                        int left = findLongestSubstring(chars, start, j, k);
                        int right = findLongestSubstring(chars, j + 1, end, k);
                        return Math.max(left, right);
                    }
                }
            }
        }

        return end - start;
    }
}
