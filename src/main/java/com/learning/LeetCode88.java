package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个可能包含重复元素的整数数组 nums ，返回该数组所有可能的子集（幂集）。
 * <p>
 * 说明： 解集不能包含重复的子集。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,2]
 * 输出:
 * [
 * [2],
 * [1],
 * [1,2,2],
 * [2,2],
 * [1,2],
 * []
 * ]
 * @Date 2019-08-19
 * @Version 1.0
 */
public class LeetCode88 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2);
        Collections.sort(list);
        List<List<Integer>> result = new ArrayList<>();
        findSubList(result, list, new ArrayList<>(), 0, list.size());
        result.forEach(i -> System.out.println(i));
    }

    private static void findSubList(List<List<Integer>> result, List<Integer> target, List<Integer> list, int index, int length) {

        result.add(new ArrayList<>(list));
        for (int i = index; i < length; i++) {
            if (i > index && target.get(i).equals(target.get(i - 1))) {
                continue;
            }
            list.add(target.get(i));
            findSubList(result, target, list, i + 1, length);
            list.remove(list.size() - 1);

        }

    }

}
