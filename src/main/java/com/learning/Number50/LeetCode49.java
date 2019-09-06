package com.learning.Number50;

import java.util.*;

/**
 * @Author xuetao
 * @Description: 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * <p>
 * 说明：
 * <p>
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 * @Date 2019-06-30
 * @Version 1.0
 */
public class LeetCode49 {
    public static void main(String[] args) {
        String[] array = {"eat", "tea", "tan", "ate", "nat", "bat"};
        combinationString(array);
    }

    public static void combinationString(String[] array) {
        int length = array.length;
        Map<String, List> map = new HashMap();
        for (int i = 0; i < length; i++) {
            char[] chars = array[i].toCharArray();
            Arrays.sort(chars);

            String result = new String(chars);
            if (!map.containsKey(result)) {
                map.put(result, new ArrayList<>());
            }
            map.get(result).add(array[i]);
        }
        List list = new ArrayList(map.values());
        list.forEach(i -> System.out.println(i));
    }

}
