package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "A"
 * <p>
 * 示例 2:
 * <p>
 * 输入: 28
 * 输出: "AB"
 * <p>
 * 示例 3:
 * <p>
 * 输入: 701
 * 输出: "ZY"
 * @Date 2019-09-20
 * @Version 1.0
 */
public class LeetCode119 {

    public static void main(String[] args) {
        System.out.println(getCloumn(676));
    }

    private static String getCloumn(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        while (num != 0) {
            int temp = (num - 1) % 26;
            stringBuilder.append((char) (temp + 65));
            num = (num - 1) / 26;
        }
        return stringBuilder.reverse().toString();
    }

}
