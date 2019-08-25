package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * <p>
 * 例如，给定三角形：
 * <p>
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * <p>
 * 自顶向下的最小路径和为 11 （即， 2 + 3 + 5 + 1 = 11）。
 * <p>
 * 说明：
 * <p>
 * 如果你可以只使用 O ( n ) 的额外空间（ n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 * @Date 2019-08-25
 * @Version 1.0
 */
public class LeetCode94 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList();

        List<Integer> list1 = Arrays.asList(2);
        List<Integer> list2 = Arrays.asList(3, 4);
        List<Integer> list3 = Arrays.asList(6, 5, 7);
        List<Integer> list4 = Arrays.asList(4, 1, 8, 3);
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        System.out.println( minimumTotal(list));
    }

    private static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        List<Integer> cache = triangle.get(n - 1);

        for (int layer = n - 2; layer >= 0; layer--) {
            for (int i = 0; i <= layer; i++) {
                int value = Math.min(cache.get(i), cache.get(i + 1)) + triangle.get(layer).get(i);
                cache.set(i, value);
            }
        }
        System.out.println(cache);

        return cache.get(0);
    }
}
