package com.learning;

/**
 * @Author xuetao
 * @Description: 给定两个以字符串形式表示的非负整数 num1 和 num2 ，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * <p>
 * 示例 1:
 * <p>
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * <p>
 * 示例 2:
 * <p>
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * <p>
 * 说明：
 * <p>
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9 。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger） 或 直接将输入转换为整数来处理 。
 * @Date 2019-06-20
 * @Version 1.0
 */
public class LeetCode43 {

    /**
     * 解题思路：以第一个数为准，获取每一个字串与后一个串求乘积，然后相加即可得到想要的结果
     *
     * @param args
     */
    public static void main(String[] args) {
        String numOne = "41";
        String numTwo = "23";
        System.out.println(multiplyString(numOne, numTwo));

    }

    public static String multiplyString(String num1, String num2) {
        if (num1.charAt(0) == '0' || num2.charAt(0) == '0') {
            return "0";
        }
        int length1 = num1.length();
        int length2 = num2.length();
        int[] array = new int[length1];

        int m = 0;
        for (int j = 0; j < length2; j++) {
            m = 10 * m + Integer.valueOf(num2.charAt(j) + "");

        }

        for (int i = length1 - 1; i >= 0; i--) {
            int s = Integer.valueOf(num1.charAt(i) + "");
            int k = (int) Math.pow(10, length1 - i - 1);
            array[i] = (s * m * k);
        }


        int result = 0;
        for (int q = array.length - 1; q >= 0; q--) {
            result += array[q];
        }

        return String.valueOf(result);
    }
}
