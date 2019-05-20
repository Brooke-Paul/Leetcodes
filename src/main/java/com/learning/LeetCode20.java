package com.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author xuetao
 * @Description: 给定一个只包括 '(' ， ')' ， '{' ， '}' ， '[' ， ']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * <p>
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * <p>
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * <p>
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * @Date 2019-05-18
 * @Version 1.0
 */
public class LeetCode20 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String string = "()))11111";
        System.out.println(validString(string));
    }

    /**
     * 思考设计字符的闭合问题， 先出现的最后使用，所以优先考虑栈的使用。
     *
     * @param string
     * @return
     */
    public static boolean validString(String string) {
        if (string == null || string.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();

        Map<Character, Character> map = new HashMap<Character, Character>(3);
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        int j;
        for (int i = 0; i < (j = string.length()); i++) {
            if (string.charAt(i) == '(' || string.charAt(i) == '{' || string.charAt(i) == '[') {
                stack.push(map.get(string.charAt(i)));
            }

            if (string.charAt(i) == ')' || string.charAt(i) == '}' || string.charAt(i) == ']') {
                if (stack.isEmpty() || stack.pop() != string.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
