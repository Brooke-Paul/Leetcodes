package com.learning.Number200;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 * <p>
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 * <p>
 * 示例1:
 * <p>
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * **输入:**pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * <p>
 * 示例 4:
 * <p>
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 * <p>
 * 说明:
 * 你可以假设 pattern 只包含小写字母， str 包含了由单个空格分隔的小写字母。
 * @Date 2019-12-01
 * @Version 1.0
 */
public class LeetCode175 {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(hasSameMode(pattern, str));
    }

    private static boolean hasSameMode(String pattern, String str) {
        String[] array = str.split(" ");

        int pLen = pattern.length();
        int sLen = array.length;
        if (pLen != sLen) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pLen; i++) {

            if (map.get(pattern.charAt(i)) != null && !map.get(pattern.charAt(i)).equals(array[i])) {
                return false;
            }

            map.putIfAbsent(pattern.charAt(i), array[i]);
        }
        return true;
    }
}
