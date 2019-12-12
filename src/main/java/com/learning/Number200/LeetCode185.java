package com.learning.Number200;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个字符串数组 words ，找到 length(word[i]) * length(word[j]) 的最大值，并且这两个单词不含有公共字母。你可以认为每个单词只包含小写字母。如果不存在这样的两个单词，返回 0。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["abcw","baz","foo","bar","xtfn","abcdef"]
 * 输出: 16 **解释:** 这两个单词为 "abcw", "xtfn"。
 * <p>
 * 示例 2:
 * <p>
 * 输入: ["a","ab","abc","d","cd","bcd","abcd"]
 * 输出: 4 **解释:** 这两个单词为 "ab", "cd"。
 * <p>
 * 示例 3:
 * <p>
 * 输入: ["a","aa","aaa","aaaa"]
 * 输出: 0 **解释:** 不存在这样的两个单词。
 * <p>
 * Created by xuetao on 2019/12/12
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode185 {
    public static void main(String[] args) {
        String[] array = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.println(findWordMaxLength(array));
    }

    private static int findWordMaxLength(String[] array) {
        int length = array.length;
        int max = 0;
        Map<Integer, String> map = new HashMap();
        for (int i = 0; i < length; i++) {
            if (!map.containsKey(array[i].length())) {
                map.put(array[i].length(), array[i]);
            } else {
                int pLen = array[i].length();
                boolean state = true;
                for (int j = 0; j < pLen; j++) {
                    if (map.get(pLen).indexOf(array[i].substring(j, j + 1)) != -1) {
                        state = false;
                        break;
                    }
                }
                if (state) {
                    max = array[i].length() * array[i].length();
                }
            }
        }

        return max;
    }
}
