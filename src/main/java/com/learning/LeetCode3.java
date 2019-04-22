package com.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 1.给定一个字符串，找出不含有重复字符的 最长子串 的长度。
 * 示例：
 * 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串， "pwke" 是 子序列 而不是子串。
 * @Date 2019-04-18
 * @Version 1.0
 */
public class LeetCode3 {


    public static int lengthOfString(String s) {
        int n = s.length();
        int num = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (unique(s, i, j)) {
                    num = Math.max(num, j - i);
                }
            }
        }
        return num;
    }

    public static boolean unique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character character = s.charAt(i);
            if (set.contains(character)) {
                return false;
            }
            set.add(character);
        }
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print("start " + start + " end " + end + " " +iterator.next());
        }
        System.out.println();
        return true;
    }

    public static void main(String[] args) {
//        String str = "pwwkew";
        String str = "abcdbcdasadqweuy";
        System.out.println(lengthOfString(str));


    }


}
