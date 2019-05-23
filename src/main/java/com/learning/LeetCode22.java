package com.learning;

import java.util.*;

/**
 * @Author xuetao
 * @Description: 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且 有效的 括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 * @Date 2019-05-23
 * @Version 1.0
 */
public class LeetCode22 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        constructBrackets(strings, 3, 3, "");
        strings.forEach(i -> System.out.println(i));
    }

    public static void constructBrackets(List<String> strings, int left, int right, String s) {

        //3 > 2   3 > 1    3 > 0
        if (left > 0) {
            constructBrackets(strings, left - 1, right, s + "(");
        }
        //3 > 2   3 > 1    3 > 0
        if (right > left) {
            constructBrackets(strings, left, right - 1, s + ")");
        }
        if (right == 0) {
            strings.add(s);
        }
    }
}
