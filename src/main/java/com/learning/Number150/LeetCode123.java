package com.learning.Number150;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author xuetao
 * @Description: 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [10,2]
 * 输出: 210
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 * <p>
 * 说明: 输出结果可能非常大，所以你需要返回一个字符串而不是整数
 * @Date 2019-09-25
 * @Version 1.0
 */
public class LeetCode123 {
    /**
     * 获取最大整数
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(array));
    }

    /**
     * 思路：构造一个比较器，用字符串去做比较，大的放在前面
     * @param nums
     * @return
     */
    public static String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        };
        Arrays.sort(str, comp);
        if (str[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }
}
