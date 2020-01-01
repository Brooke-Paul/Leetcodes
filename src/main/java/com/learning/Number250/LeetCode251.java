package com.learning.Number250;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定两个数组，写一个函数来计算它们的交集。
 * <p>
 * 例子:
 * <p>
 * 给定 num1 = [1, 2, 2, 1] , nums2 = [2, 2] , 返回 [2] .
 * <p>
 * 提示:
 * <p>
 * 每个在结果中的元素必定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * <p>
 * Created by xuetao on 2020/1/1
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode251 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 1};
        System.out.println(intersectionArray(num1, num2));
    }

    private static List<Integer> intersectionArray(int[] num1, int[] num2) {
        List<Integer> list = new ArrayList<>();
        if (num1 == null || num1.length == 0) {
            return new ArrayList<>();
        }

        if (num2 == null || num2.length == 0) {
            return new ArrayList<>();
        }
        int len1 = num1.length;
        int len2 = num2.length;

        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (num1[i] == num2[j]) {
                    if (!list.contains(num1[i])) {
                        list.add(num1[i]);
                    }
                }
            }
        }

        return list;

    }
}
