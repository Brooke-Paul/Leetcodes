package com.learning.Number150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 所有 DNA 由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：“ACGAATTCCG”。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。
 * <p>
 * 编写一个函数来查找 DNA 分子中所有出现超多一次的10个字母长的序列（子串）。
 * <p>
 * 示例:
 * <p>
 * 输入: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
 * <p>
 * 输出: ["AAAAACCCCC", "CCCCCAAAAA"]
 * @Date 2019-09-26
 * @Version 1.0
 */
public class LeetCode124 {


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String s = "AAAAACCCCCAABAACCCCCCAAAAAACCCCC";
        findSubString(s, map);


        List<String> list = new ArrayList<>();
        map.forEach((s1, integer) -> {
            if (integer > 1) {
                list.add(s1);
            }
        });
        System.out.println(list);
    }


    /**
     * 查找字串长度为10并且出现次数大于1次的字串集合
     */
    private static void findSubString(String s, Map<String, Integer> map) {

        if (s == null) {
            return;
        }
        int length = s.length();
        if (length < 11) {
            return;
        }
        for (int i = 0; i < length - 9; i++) {
            map.put(s.substring(i, i + 10), map.getOrDefault(s.substring(i, i + 10), 0) + 1);
        }
    }
}
