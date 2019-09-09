package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 给定一个字符串，逐个翻转字符串中的每个单词。
 * <p>
 * 示例:
 * <p>
 * 输入: "the sky is blue",
 * **输出: **"blue is sky the".
 * <p>
 * 说明:
 * <p>
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * 进阶: 请选用C语言的用户尝试使用 O (1) 时间复杂度的原地解法。
 * @Date 2019-09-09
 * @Version 1.0
 */
public class LeetCode108 {
    public static void main(String[] args) {
        String s = " the sky is blue ";
        reverseString(s);

    }

    private static void reverseString(String string) {
        if (null == string || string == "") {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] array = string.trim().split(" ");

        for (int i = array.length - 1; i > 0; i--) {
            stringBuilder.append(array[i] + " ");
        }
        stringBuilder.append(array[0]);
        System.out.println(stringBuilder.toString());

    }
}
