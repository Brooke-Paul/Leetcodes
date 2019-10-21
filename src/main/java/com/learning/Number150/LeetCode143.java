package com.learning.Number150;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author xuetao
 * @Description: 找出所有相加之和为 n 的 k 个数的组合 。 组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * <p>
 * 说明：
 * <p>
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1:
 * <p>
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * <p>
 * 示例 2:
 * <p>
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 * @Date 2019-10-21
 * @Version 1.0
 */
public class LeetCode143 {


    public static void main(String[] args) {

        int k = 3;
        int target = 9;
        List<List<Integer>> lists = new ArrayList<>();
        findSumArray(lists, k, target);
        lists.forEach(i -> System.out.println(i));
    }

    private static void findSumArray(List<List<Integer>> lists, int k, int target) {
        findSumTarget(lists, new ArrayList<>(), 0, k, 1, target);
    }


    private static void findSumTarget(List<List<Integer>> lists, List<Integer> list, int i, int k, int m, int target) {
        if (list.size() == k && list.stream().mapToInt(Integer::intValue).sum() == target) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int n = m; n <= 9; n++) {
            for (int j = i; j < k; j++) {
                if (list.contains(n)) {
                    continue;
                }
                list.add(n);
                findSumTarget(lists, list, j + 1, k, n + 1, target);
                list.remove(list.size() - 1);
            }
        }

    }
}
