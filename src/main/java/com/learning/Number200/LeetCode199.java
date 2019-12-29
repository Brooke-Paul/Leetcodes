package com.learning.Number200;

import java.util.HashSet;
import java.util.Set;

/**
 * Program Name: leetcodes
 * <p>
 * Description:编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1：
 * 给定 s = "hello", 返回 "holle".
 * <p>
 * 示例 2：
 * 给定 s = "leetcode", 返回 "leotcede".
 * <p>
 * 注意:
 * 元音字母不包括 "y".
 * <p>
 * Created by xuetao on 2019/12/29
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode199 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        Set<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        //use two pointers approach would be the fastest
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            while (i < j && !vowels.contains(left)) {
                i++;
                left = s.charAt(i);
            }
            while (i < j && !vowels.contains(right)) {
                j--;
                right = s.charAt(j);
            }
            char temp = left;
            sb.setCharAt(i, right);
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb.toString();
    }
}
