package com.learning;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @Author xuetao
 * @Description: 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * 1-> ""
 * 2-> abc
 * 3-> def
 * 4-> ghi
 * 5-> jkl
 * 6-> mno
 * 7-> pqrs
 * 8-> tuv
 * 9-> wxyz
 * <p>
 * 示例:
 * <p>
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * <p>
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 * @Date 2019-05-14
 * @Version 1.0
 */
public class LeetCode17 {

    /**
     * 先获取数字对应字母下标，再组合字串
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "79";
        letterCombinations(str);
    }

    public static void letterCombinations(String s) {
        String pattern = "[2-9]{1,}";
        boolean isMatch = Pattern.matches(pattern, s);
        if (!isMatch) {
            return;
        }
        String[] letterArray = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combine(letterArray, 0, s, null);


    }

    /**
     * 递归获取字符串
     *
     * @param letterArray 字母数组
     * @param index       数字字符串长度索引
     * @param string      数字字符串
     * @param letterList  拼接的字符串集合
     */
    public static void combine(String[] letterArray, int index, String string, List<String> letterList) {
        if (index == string.length()) {
            letterList.forEach(i -> System.out.println(i));
            return;
        }
        int num = string.charAt(index) - '0';
        String letter = letterArray[num];
        List<String> childList = new ArrayList<>();

        for (int i = 0; i < letter.length(); i++) {
            if (index == 0) {
                childList.add(String.valueOf(letter.charAt(i)));
            } else {
                for (int j = 0; j < letterList.size(); j++) {
                    childList.add(letterList.get(j) + letter.charAt(i));
                }
            }
        }
        letterList = childList;
        combine(letterArray, ++index, string, letterList);
    }


}
