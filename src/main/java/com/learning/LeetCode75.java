package com.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个字符串 S 和一个字符串 T，请在 S 中找出包含 T 所有字母的最小子串。
 * <p>
 * 示例：
 * <p>
 * 输入: S = "ADOBECODEBANC", T = "ABC"
 * 输出: "BANC"
 * <p>
 * 说明：
 * <p>
 * 如果 S 中不存这样的子串，则返回空字符串 "" 。
 * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
 * @Date 2019-07-30
 * @Version 1.0
 */
public class LeetCode75 {


    public static void main(String[] args) {
        String source = "ADOBECODEBANC";
        int sLen = source.length();
        String target = "ABC";
        int tLen = target.length();
        Map<Character, Character> map = new HashMap<Character, Character>(tLen);
        if (!containsString(map, tLen, source, target)) {
            System.out.println("S 中不存这样的子串");
            return;
        }
        compare(map, sLen, source, 0, 0, 0, 0);

    }

    /**
     * 第一步： 判断S 中 是否包含 每一个T 的字符，否则直接返回空串
     *
     * @param map
     * @param tLen
     * @param source
     * @param target
     * @return
     */
    private static boolean containsString(Map<Character, Character> map, int tLen, String source, String target) {
        boolean result = true;
        for (int i = 0; i < tLen; i++) {
            Character character = target.charAt(i);
            if (!source.contains(character.toString())) {
                result = false;
                break;
            }
            map.put(character, character);
        }
        return result;
    }

    private static void compare(Map<Character, Character> map, int sLen, String source, int start, int startIndex, int endIndex, int min) {
        for (int i = start; i < sLen; i++) {
            Character character = source.charAt(i);
            if (map.containsKey(character)) {
                map.remove(character);
            }
            if (map.isEmpty()) {
                min = Math.min(min, endIndex - startIndex);
                if (min == 0) {
                    System.out.println("S 中不存这样的子串");
                } else {
                    System.out.println("startIndex " + startIndex + " endIndex " + endIndex);
                }
            }
            compare(map, sLen, source, i + 1, startIndex, endIndex, min);
        }

    }

}
