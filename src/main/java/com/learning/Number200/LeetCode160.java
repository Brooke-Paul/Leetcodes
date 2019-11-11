package com.learning.Number200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * <p>
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 * @Date 2019-11-10
 * @Version 1.0
 */
public class LeetCode160 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(ectopicWords(s, t));
    }

    private static boolean ectopicWords(String s, String t) {

        char[] sa = s.toCharArray();
        char[] st = t.toCharArray();
        if (sa.length != st.length) {
            return false;
        }

        Arrays.sort(sa);
        Arrays.sort(st);

        for (int i = 0; i < sa.length; i++) {
            if (sa[i] != st[i]) {
                return false;
            }
        }
        return true;
    }

}
