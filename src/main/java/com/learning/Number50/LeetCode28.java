package com.learning.Number50;

/**
 * @Author xuetao
 * @Description: 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * <p>
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * @Date 2019-05-31
 * @Version 1.0
 */
public class LeetCode28 {

    public static void main(String[] args) {
        System.out.println(findStr("hello", "ll"));
    }

    /**
     * 利用string contains 判断是否包含
     * 再去截取字符串比较
     *
     * @param hasystack
     * @param needle
     * @return
     */
    public static int findStr(String hasystack, String needle) {

        if (hasystack == null || hasystack == "") {
            return -1;
        }
        if (needle == null || needle == "") {
            return 0;
        }


        if (!hasystack.contains(needle)) {
            return -1;
        }
        for (int i = 0; i <= hasystack.length() - needle.length(); i++) {
            if (hasystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
