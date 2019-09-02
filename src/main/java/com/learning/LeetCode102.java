package com.learning;

import java.util.Arrays;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个 非空 字符串 s 和一个包含 非空 单词列表的字典 wordDict ，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 * <p>
 * 说明：
 * <p>
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 * <p>
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * <p>
 * 示例 2：
 * <p>
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 * 注意你可以重复使用字典中的单词。
 * <p>
 * 示例 3：
 * <p>
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 * @Date 2019-09-02
 * @Version 1.0
 */
public class LeetCode102 {
    public static void main(String[] args) {

        String s = "catsandog";
        List<String> wordList = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(splitString(s, wordList));

    }


    private static boolean splitString(String s, List<String> wordList) {

        if (s == null) {
            return false;
        }
        int length = s.length();
        int startIndex = 0;
        int i = 0;
        for (; i <= length; i++) {
            String index = s.substring(startIndex, i);
            System.out.println(index);
            if (wordList.contains(index)) {
                startIndex = i;
            }
            System.out.println(startIndex);
        }

        if (startIndex == length) {
            return true;
        }

        return false;
    }
}
