package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * @Date 2019-06-27
 * @Version 1.0
 */
public class LeetCode46 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        List<List<Integer>> lists = new ArrayList<>();
        fullPermutation(lists, new ArrayList(), array);
        lists.forEach(i -> {
            i.forEach(j -> System.out.print(j));
            System.out.println();
        });
    }

    /**
     *  组装List 递归查询，如果list 中包含已有数据，跳过循环。 如果size刚好等于数组长度，生成新List
     * @param lists
     * @param list
     * @param array
     */
    public static void fullPermutation(List<List<Integer>> lists, List list, int[] array) {
        int length = array.length;
        if (list.size() == length) {
            lists.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < length; i++) {
                if (list.contains(array[i])) {
                    continue;
                }
                list.add(array[i]);
                fullPermutation(lists, list, array);
                list.remove(list.size() - 1);
            }
        }

    }


}
