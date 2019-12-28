package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 请编写一个函数，其功能是将输入的字符串反转过来。
 * <p>
 * 示例：
 * <p>
 * **输入：**s = "hello"
 * 返回："olleh"
 * <p>
 * Created by xuetao on 2019/12/28
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode198 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        char[] array = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            array[j++] = s.charAt(i);

        }

        return new String(array);
    }
}
