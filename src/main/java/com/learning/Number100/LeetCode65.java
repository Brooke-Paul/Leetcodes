package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 验证给定的字符串是否为数字。
 * <p>
 * 例如:
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * <p>
 * 说明: 我们有意将问题陈述地比较模糊。在实现代码之前，你应当事先思考所有可能的情况。
 * <p>
 * 更新于 2015-02-10:
 * C++ 函数的形式已经更新了。如果你仍然看见你的函数接收 const char * 类型的参数，请点击重载按钮重置你的代码。
 * @Date 2019-07-20
 * @Version 1.0
 */
public class LeetCode65 {
    public static void main(String[] args) {
        String str = "1e";
        str = str.trim();
        System.out.println(isNumber(str));
    }

    /**
     * @param s
     * @return
     */
    private static boolean isNumber(String s) {
        boolean number = false;
        boolean eSeen = false;
        boolean pointSeen = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                number = true;
            } else if (s.charAt(i) == '.') {
                if (eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if (s.charAt(i) == 'e') {
                if (eSeen || !number) {
                    return false;
                }
                eSeen = true;
                number = false;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }

        }
        return number;
    }
}

