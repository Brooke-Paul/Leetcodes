package com.learning.Number150;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个已按照 升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * <p>
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2 。
 * <p>
 * 说明:
 * <p>
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * <p>
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 * @Date 2019-09-19
 * @Version 1.0
 */
public class LeetCode118 {
    public static void main(String[] args) {
        int[] array = {2, 3, 6, 7, 11, 15};
        List<List<Integer>> lists = findTargetIndex(array, 9);
        lists.forEach(i -> System.out.println(i));
    }

    private static List<List<Integer>> findTargetIndex(int[] array, int target) {
        List<List<Integer>> lists = new ArrayList<>();

        int start = 0;
        int end = array.length - 1;
        int min = array[0];

        if (min >= target) {
            return lists;
        }
        int mid = 0;
        while (start + 1 < end) {

            mid = (start + end) / 2;


            if (array[mid] > target) {
                end--;
            } else if (array[mid] < target) {
                start++;
            }
        }
        for (int i = 0; i < mid; i++) {

            for (int j = i + 1; j < mid; j++) {
                if (array[i] + array[j] == target) {
                    List<Integer> list = new ArrayList<>(2);
                    list.add(i + 1);
                    list.add(j + 1);
                    lists.add(list);
                }
            }
        }
        return lists;
    }

}
