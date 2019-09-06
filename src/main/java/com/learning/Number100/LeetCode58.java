package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明： 一个单词是指由字母组成，但不包含任何空格的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 * @Date 2019-07-13
 * @Version 1.0
 */
public class LeetCode58 {

    public static void main(String[] args) {

        String s = "H elloWorld ";
        System.out.println(findLastStringOne(s));
        System.out.println(findLastStringTwo(s));

    }

    /**
     * 方法一： split获取字符串数组
     *
     * @param s
     * @return
     */
    public static int findLastStringOne(String s) {
        if (s == "" || s == null) {
            return 0;
        }
        s = s.trim();
        String[] array = s.split(" ");

        String lastStr = array.length > 1 ? array[array.length - 1] : "";
        System.out.println(lastStr);
        return lastStr.length();
    }


    /**
     * 方法二： for循环获取
     *
     * @param s
     * @return
     */
    public static int findLastStringTwo(String s) {
        if (s == "" || s == null) {
            return 0;
        }
        s = s.trim();
        int n = 0;
        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                n++;
            } else {
                break;
            }
        }

        return n == length ? 0 : n;
    }


}
