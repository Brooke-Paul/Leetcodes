package com.learning.Number150;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定两个字符串 s 和 t ，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "egg", t = "add"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * 输入: s = "paper", t = "title"
 * 输出: true
 * <p>
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度。
 * @Date 2019-10-11
 * @Version 1.0
 */
public class LeetCode136 {

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(sameStructure(s, t));

    }

    private static boolean sameStructure(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) {
            return false;
        }
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < sLen; i++) {
            String s1 = s.substring(i, i + 1);
            String t1 = t.substring(i, i + 1);
            map.putIfAbsent(s1, t1);
            if (!t1.equals(map.get(s1))) {
                return false;
            }

        }

        return true;


    }


}
