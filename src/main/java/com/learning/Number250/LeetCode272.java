package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定两个字符串 s 和 t ，它们只包含小写字母。
 * <p>
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * <p>
 * 请找出在 t 中被添加的字母。
 * <p>
 * 示例:
 * <p>
 * 输入：
 * s = "abcd"
 * t = "abcde"
 * <p>
 * 输出：
 * e
 * <p>
 * 解释：
 * 'e' 是那个被添加的字母。
 * <p>
 * Created by xuetao on 2020/1/27
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode272 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findUniqueChar(s, t));
    }

    private static Character findUniqueChar(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();

        for (char c : ta) {
            if (s.indexOf(c) == -1) {
                return c;
            }
        }
        return null;
    }
}
