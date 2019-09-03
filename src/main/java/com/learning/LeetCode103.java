package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个 非空 字符串 s 和一个包含 非空 单词列表的字典 wordDict ，在字符串中增加空格来构建一个句子，使得句子中所有的单词都在词典中。返回所有这些可能的句子。
 * <p>
 * 说明：
 * <p>
 * 分隔时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 * <p>
 * 输入: s = "catsanddog"
 * wordDict = ["cat", "cats", "and", "sand", "dog"]
 * 输出: [   "cats and dog",   "cat sand dog" ]
 * <p>
 * 示例 2：
 * <p>
 * 输入: s = "pineapplepenapple"
 * wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 * 输出: [
 * "pine apple pen apple",
 * "pineapple pen apple",
 * "pine applepen apple"
 * ]
 * 解释: 注意你可以重复使用字典中的单词。
 * <p>
 * 示例 3：
 * <p>
 * 输入: s = "catsandog"
 * wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: []
 * @Date 2019-09-03
 * @Version 1.0
 */
public class LeetCode103 {

    public static void main(String[] args) {

        String s = "pineapplepenapple";
        List<String> wordList = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        List<List<String>> result = new ArrayList<>();
        System.out.println(splitStringII(result, s, 0, wordList, new ArrayList<>()));

    }


    private static List<List<String>> splitStringII(List<List<String>> result, String s, int index, List<String> wordList, List<String> stringList) {
        if (s == null) {
            return null;
        }
        int length = s.length();

        for (int i = index; i <= length; i++) {
            String word = s.substring(index, i);
            if (wordList.contains(word)) {
                stringList.add(word);
                if (i == length) {
                    result.add(new ArrayList<>(stringList));
                } else {
                    splitStringII(result, s, i, wordList, stringList);
                }
                stringList.remove(stringList.size() - 1);
            }
        }
        return result;
    }
}
