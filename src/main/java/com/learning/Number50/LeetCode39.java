package com.learning.Number50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个 无重复元素 的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的数字可以无限制重复被选取。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括 target ）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1:
 * <p>
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 * [7],
 * [2,2,3]
 * ]
 * <p>
 * 示例 2:
 * <p>
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 * [2,2,2,2],
 * [2,3,3],
 * [3,5]
 * ]
 * @Date 2019-06-15
 * @Version 1.0
 */
public class LeetCode39 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        findChildCollection(list, new ArrayList(), candidates, target, 0);

        list.forEach(i -> System.out.println(i));
    }

    /**
     * 数字之和为target， 数字组合可重复，首先考虑递归操作，从第一位起循环嵌套，如果数组最小值大于target 去除最后一位继续遍历
     *
     * @param arrayList
     * @param current
     * @param array
     * @param target
     * @param start
     */
    public static void findChildCollection(List<List<Integer>> arrayList, List<Integer> current, int[] array, int target, int start) {
        int length = array.length;
        if (target > 0) {
            for (int i = start; i < length; i++) {
                if (array[i] > target) {
                    break;
                }
                current.add(array[i]);
                findChildCollection(arrayList, current, array, target - array[i], i);
                current.remove(current.size() - 1);
            }
        } else if (target == 0) {
            arrayList.add(new ArrayList<>(current));
        }

    }


}
