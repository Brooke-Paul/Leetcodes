package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个字符串 s 和一些长度相同的单词 words。 在 s 中找出可以恰好串联 words 中所有单词的子串的起始位置。
 * <p>
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * s = "barfoothefoobarman",
 * words = ["foo","bar"]
 * 输出: [0,9]
 * 解释: 从索引 0 和 9 开始的子串分别是 "barfoor" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * s = "wordgoodstudentgoodword",
 * words = ["word","student"]
 * 输出: []
 * @Date 2019-06-02
 * @Version 1.0
 */
public class LeetCode30 {
    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        List<Integer> integers = matchStr(s, words);

        if (integers != null) {
            integers.forEach(i -> System.out.println(i));
        }

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (j == i) {
//                    continue;
//                }
//                for (int x = 0; x < 4; x++) {
//                    if (x == i || x == j) {
//                        continue;
//                    }
//                    for (int y = 0; y < 4; y++) {
//                        if (y == i || y == j || y == x) {
//                            continue;
//                        }
//                        System.out.println(i + "" + j + "" + x + "" + y);
//                    }
//                }
//            }
//        }
        List<StringBuffer> stringBuffers = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            List<Integer> list = new ArrayList<>();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(words[i]);
            list.add(i);
            matchStr(words, list, stringBuffer, 1, stringBuffers);

        }
        if (null != stringBuffers) {
            stringBuffers.forEach(j -> System.out.println("s ===" + s + ":::::" + j + " " + s.indexOf(j.toString())));
        }
    }

    /**
     * 方法1： 字符串substring 与 map 配合解决
     *
     * @param string
     * @param words
     * @return
     */
    public static List<Integer> matchStr(String string, String[] words) {
        if (words == null || words.length == 0) {
            return null;
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], 1);
        }


        List<Integer> result = new ArrayList<>();
        int start = 0;
        int length = words.length;
        int stringLen = string.length();
        for (int j = 0; j < stringLen; j++) {
            start = j;
            Map<String, Integer> child = new HashMap<>(map);
            int match = 0;
            for (int m = j + 1; m < stringLen; m++) {
                String word = string.substring(j, m);
                if (child.containsKey(word) && child.get(word) == 1) {
                    child.put(word, 0);
                    j = m;
                    match++;
                }
                if (match == length) {
                    boolean allMatch = true;
                    for (String key : child.keySet()) {
                        if (child.get(key) != 0) {
                            allMatch = false;
                            break;
                        }
                    }
                    if (allMatch) {
                        result.add(start);
                    }
                    match = 0;
                }
            }

        }
        return result;

    }

    /**
     * 方法2： 按照排列组合的思想获取每一层字串，避免重复
     *
     * @param words
     * @param list
     * @param stringBuffer
     * @param n
     * @param result
     */
    public static void matchStr(String[] words, List<Integer> list, StringBuffer stringBuffer, int n, List<StringBuffer> result) {
        for (int i = 0; i < words.length; i++) {
            if (list.contains(i)) {
                continue;
            }
            List<Integer> integerList = new ArrayList<>();
            integerList.addAll(list);
            StringBuffer stringBuffer1 = new StringBuffer();
            stringBuffer1.append(stringBuffer + words[i]);

            if (n < words.length - 1) {
                integerList.add(i);
                matchStr(words, integerList, stringBuffer1, n + 1, result);
            } else {
                result.add(stringBuffer1);
            }
        }

    }
}
