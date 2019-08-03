package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一组不同的整数，nums，返回所有可能的子集（包括空集和自身）。
 * <p>
 * 注意：解决方案集不能包含重复的子集。
 * <p>
 * Example:
 * <p>
 * Input: nums = [1,2,3]
 * Output:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 * @Date 2019-08-03
 * @Version 1.0
 */
public class LeetCode77 {
    public static void main(String[] args) {
        int[] array = {1, 2};
        int length = array.length;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsets(array, length, 0, lists, list);
        lists.forEach(i -> System.out.println(i));

    }

    private static void subsets(int[] array, int length, int index, List<List<Integer>> lists, List<Integer> list) {
        lists.add(new ArrayList<>(list));


        for (int i = index; i < length; i++) {
            list.add(array[i]);

            subsets(array, length, i + 1, lists, list);
            list.remove(list.size() - 1);
        }


    }
}
