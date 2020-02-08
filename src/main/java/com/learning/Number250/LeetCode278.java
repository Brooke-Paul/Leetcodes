package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个以字符串表示的非负整数 num ，移除这个数中的 k 位数字，使得剩下的数字最小。
 * <p>
 * 注意:
 * <p>
 * num 的长度小于 10002 且 ≥ k。
 * num 不会包含任何前导零。
 * 示例 1 :
 * <p>
 * 输入: num = "1432219", k = 3
 * 输出: "1219"
 * 解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
 * <p>
 * 示例 2 :
 * <p>
 * 输入: num = "10200", k = 1
 * 输出: "200"
 * 解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
 * <p>
 * 示例 3 :
 * <p>
 * 输入: num = "10", k = 2
 * 输出: "0"
 * 解释: 从原数字移除所有的数字，剩余为空就是0。
 * <p>
 * Created by xuetao on 2020/2/7
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode278 {
    public static void main(String[] args) {
        String s = "10011";
        int k = 3;
        System.out.println(removeK(s, k));
    }

    private static String removeK(String s, int k) {
        int index = 0;
        int length = s.length() - k;
        char[] array = s.toCharArray();
        char[] result = new char[s.length()];
        for (int i = 0; i < array.length; i++) {
            char element = s.charAt(i);
            //移除操作
            if (index > 0 && result[index - 1] > element && k > 0) {
                index--;
                k--;
            }
            result[index++] = element;
        }
        int x = 0;
        while (x < length && result[x] == '0') {
            x++;
        }
        return x == length ? "0" : new String(result, x, length - x);

    }

}
