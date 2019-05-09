package com.learning;

/**
 * @Author xuetao
 * @Description: 罗马数字包含以下七种字符： I ， V ， X ， L ， C ， D 和 M 。
 * <p>
 * 字符 数值
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 * <p>
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做 XXVII , 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII ，而是 IV 。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX 。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 3
 * 输出: "III"
 * <p>
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "IV"
 * <p>
 * 示例 3:
 * <p>
 * 输入: 9
 * 输出: "IX"
 * <p>
 * 示例 4:
 * <p>
 * 输入: 58
 * 输出: "LVIII"
 * 解释: C = 100, L = 50, XXX = 30, III = 3.
 * <p>
 * 示例 5:
 * <p>
 * 输入: 1994
 * 输出: "MCMXCIV"
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * @Date 2019-05-09
 * @Version 1.0
 */
public class LeetCode12 {
    private static String[] m = {"", "M", "MM", "MMM"};
    private static String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] x = {"", "X", "XX", "XXX", "LX", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    //思路：整数范围在（1~3999之间)， 可以将每一位数字对应的字母存入数组中，再按位从数组中取出即可
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }


    public static String intToRoman(int num) {
        if (num > 3999 || num < 1) {
            throw new IllegalArgumentException("Please enter the number between 0 and 3999.");
        }
        return m[num / 1000] + c[num / 100 % 10] + x[num / 10 % 10] + i[num % 10];

    }

}