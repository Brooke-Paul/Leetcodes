package com.learning.Number150;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以字符串形式返回小数。
 * <p>
 * 如果小数部分为循环小数，则将循环的部分括在括号内。
 * <p>
 * 示例 1:
 * <p>
 * 输入: numerator = 1, denominator = 2
 * 输出: "0.5"
 * <p>
 * 示例 2:
 * <p>
 * 输入: numerator = 2, denominator = 1
 * 输出: "2"
 * <p>
 * 示例 3:
 * <p>
 * 输入: numerator = 2, denominator = 3
 * 输出: "0.(6)"
 * @Date 2019-09-18
 * @Version 1.0
 */
public class LeetCode117 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(2, 3));
    }

    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if (numerator < 0 ^ denominator < 0) {
            sb.append("-");
        }
        long a = Math.abs(Long.valueOf(numerator));
        long b = Math.abs(Long.valueOf(denominator));
        long mod = a % b;
        sb.append(String.valueOf(a / b));
        if (mod == 0) {
            return sb.toString();
        }
        sb.append(".");
        Map<Long, Integer> map = new HashMap<>();
        while (mod != 0) {
            if (map.containsKey(mod)) {
                sb.insert(map.get(mod), "(");
                sb.append(")");
                break;
            }
            map.put(mod, sb.length());
            mod *= 10;
            sb.append(String.valueOf(mod / b));
            mod %= b;
        }
        return sb.toString();
    }
}
