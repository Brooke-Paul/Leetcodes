package com.learning.Number250;

import java.util.*;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 * <p>
 * 注意事项： 您可以假定该字符串只包含小写字母。
 * <p>
 * Created by xuetao on 2020/1/25
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode271 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqueChar(s));
    }

    private static int firstUniqueChar(String s) {
        Map<Character, Integer> characterSet = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.put(s.charAt(i), characterSet.getOrDefault(s.charAt(i), 0) + 1);
        }

        Iterator<Map.Entry<Character, Integer>> iterator = characterSet.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry m = iterator.next();
            if (1 == (Integer) m.getValue()) {
                return s.indexOf(m.getKey().toString());
            }
        }
        return -1;
    }


}
