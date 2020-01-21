package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 * <p>
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * <p>
 * 注意：
 * <p>
 * 你可以假设两个字符串均只含有小写字母。
 * <p>
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * <p>
 * Created by xuetao on 2020/1/21
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode268 {
    public static void main(String[] args) {
        String a = "aa";
        String b = "aab";
        System.out.println(canConstruct(a, b));
    }

    private static boolean canConstruct(String a, String b) {
        char[] magazine = b.toCharArray();
        int[] mag = new int[256];

        for (int i = 0; i < magazine.length; i++) {
            mag[magazine[i] - 'a']++;
        }

        char[] ransom = a.toCharArray();
        for (int j = 0; j < ransom.length; j++) {
            if (mag[ransom[j] - 'a'] <= 0) {
                return false;
            }
            mag[ransom[j] - 'a']--;
        }
        return true;


    }
}
