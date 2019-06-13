package com.learning;

/**
 * @Author xuetao
 * @Description: 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1. 1
 * 2. 11
 * 3. 21
 * 4. 1211
 * 5. 111221
 * <p>
 * 1 被读作 "one 1" ( "一个一" ) , 即 11 。
 * 11 被读作 "two 1s" ( "两个一" ）, 即 21 。
 * 21 被读作 "one 2" ,  " one 1" （ "一个二" , "一个一" ) , 即 1211 。
 * <p>
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: "1"
 * <p>
 * 示例 2:
 * <p>
 * 输入: 4
 * 输出: "1211"
 * @Date 2019-06-13
 * @Version 1.0
 */
public class LeetCode38 {
    public static void main(String[] args) {
        System.out.println(numberOff(2));
    }


    public static String numberOff(int num) {
        String s = "1";
        if (num == 0 || num == 1) {
            return s;
        }
        int count = 1;
        StringBuffer stringBuffer = new StringBuffer(s);
        for (int i = 0; i < num; i++) {
            char st = stringBuffer.charAt(0);
            System.out.println(st);
            int length = stringBuffer.length();
            for (int j = 0; j < length; j++) {
                if (stringBuffer.charAt(j) == st) {
                    count++;
                } else {
                    System.out.println("count  " + count + "st  " + st);
                    stringBuffer.append(count).append(st);
                    count = 1;
                    st = stringBuffer.charAt(j);
                }

            }
            stringBuffer = new StringBuffer();

            System.out.println("count  " + count + "st  " + st);
            stringBuffer.append(count).append(st);
        }
        return stringBuffer.toString();
    }
}
