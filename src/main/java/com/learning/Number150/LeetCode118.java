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

    /**
     * 方法改进  判断两数之和与目标值比较
     * @param array
     * @param target
     * @return
     */
    private static List<List<Integer>> findTargetIndex(int[] array, int target) {
        List<List<Integer>> lists = new ArrayList<>();

        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int num = array[start] + array[end];
            if (num > target) {
                end--;
            } else if (num < target) {
                start++;
            } else {
                List<Integer> list = new ArrayList<>(2);
                list.add(start + 1);
                list.add(end + 1);
                lists.add(list);
                start++;
                end--;
            }
        }
        return lists;
    }

}
