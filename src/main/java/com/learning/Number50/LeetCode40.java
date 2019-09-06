package com.learning.Number50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的每个数字在每个组合中只能使用一次。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1:
 * <p>
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * <p>
 * 示例 2:
 * <p>
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 * [1,2,2],
 * [5]
 * ]
 * @Date 2019-06-16
 * @Version 1.0
 */
public class LeetCode40 {

    /**
     * 明日解决
     * 第一步:排序
     * 第二步:递归遍历
     * 第三步:条件判断
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(array);
        int target = 8;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        findChildCollection(list, new ArrayList(), array, target, 0);
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
                // 从第一位起，大于target 直接跳出循环
                if (array[i] > target) {
                    break;
                }
                // 判断相邻两个数是否相等，相等的话直接进入下一次循环
                if ((i > start && array[i - 1] == array[i])) {
                    continue;
                }
                current.add(array[i]);
                findChildCollection(arrayList, current, array, target - array[i], i + 1);
                current.remove(current.size() - 1);
            }
        } else if (target == 0) {
            arrayList.add(new ArrayList<>(current));
        }

    }
}
