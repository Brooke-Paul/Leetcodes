package com.learning.Number250;

/**
 * Program Name: com.learning.Number250
 * Description: 给定两个字符串形式的非负整数 num1 和 num2 ，计算它们的和。
 * <p>
 * 注意：
 * <p>
 * num1 和 num2 的长度都小于 5100.
 * num1 和 num2 都只包含数字 0-9 .
 * num1 和 num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 * Created by xuetao on 2020/2/20
 *
 * @author xuetao
 * @version 1.0
 */

public class LeetCode287 {

    public static void main(String[] args) {

        String num1 = "2124";
        String num2 = "0126";
        System.out.println(transfer(num1) + transfer(num2));
    }

    private static int transfer(String num) {
        int len = num.length();
        int n = 0;
        for (int i = 0; i < len; i++) {
            int x = num.charAt(i) - '0';
            n = n * 10 + x;
        }
        return n;

    }

}
