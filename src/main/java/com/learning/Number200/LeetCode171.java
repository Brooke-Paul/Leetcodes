package com.learning.Number200;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个仅包含数字 0-9 的字符串和一个目标值，在数字之间添加 二元 运算符(不是一元) + 、 - 或 * ，返回所有能够得到目标值的表达式。
 * <p>
 * 示例 1:
 * <p>
 * 输入: _num_ = "123", target = 6
 * 输出: ["1+2+3", "1*2*3"]
 * <p>
 * 示例 2:
 * <p>
 * 输入: _num_ = "232", target = 8
 * 输出: ["2*3+2", "2+3*2"]
 * <p>
 * 示例 3:
 * <p>
 * 输入: _num_ = "105", target = 5
 * 输出: ["1*0+5","10-5"]
 * <p>
 * 示例 4:
 * <p>
 * 输入: _num_ = "00", target = 0
 * 输出: ["0+0", "0-0", "0*0"]
 * <p>
 * 示例 5:
 * <p>
 * 输入: _num_ = "3456237490", target = 9191
 * 输出: []
 * @Date 2019-11-26
 * @Version 1.0
 */
public class LeetCode171 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String s = "105";

        dfs(list, stringBuilder, s, 0, 6, 0, 0);
        System.out.println(list);
    }

    private static void dfs(List<String> list, StringBuilder stringBuilder, String num, int i, int target, int prev, int curr) {

        if (i == num.length()) {
            if (target == prev) {
                list.add(stringBuilder.toString());
            }
            return;
        }


        for (int j = i; j < num.length(); j++) {
            if (num.charAt(i) == '0' && j != i) {
                break;
            }

            int temp = Integer.parseInt(num.substring(i, j + 1));
            int length = stringBuilder.length();
            if (i == 0) {
                dfs(list, stringBuilder.append(temp), num, i + 1, target, temp, temp);
                stringBuilder.setLength(length);
            } else {
                dfs(list, stringBuilder.append("+").append(temp), num, i + 1, target, prev + temp, temp);
                stringBuilder.setLength(length);
                dfs(list, stringBuilder.append("-").append(temp), num, i + 1, target, prev - temp, -temp);
                stringBuilder.setLength(length);
                dfs(list, stringBuilder.append("*").append(temp), num, i + 1, target, prev - curr + curr * temp, curr * temp);
                stringBuilder.setLength(length);
            }
        }
    }

}
