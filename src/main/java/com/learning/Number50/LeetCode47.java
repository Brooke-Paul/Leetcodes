package com.learning.Number50;

import java.util.*;

/**
 * @Author xuetao
 * @Description: 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,1,2]
 * 输出:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 * @Date 2019-06-27
 * @Version 1.0
 */
public class LeetCode47 {

    /**
     * 思路：先排序，通过map组装下标，保证下标不重复，然后组装List，最后判断集合数据
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1, 1, 1};
        Arrays.sort(array);
        fullPermutation(array);
    }

    public static void fullPermutation(int[] array) {
        if (array == null || array.length < 1) {
            return;
        }
        int length = array.length;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            List<Integer> listIndex = new ArrayList();
            List<Integer> list = new ArrayList();
            listIndex.add(i);
            list.add(array[i]);
            findAllNext(lists, listIndex, list, array, length);
        }

        lists.forEach(i -> {
            i.forEach(j -> System.out.print(j));
            System.out.println(" ");
        });

    }

    public static void findAllNext(List<List<Integer>> lists, List<Integer> listIndex, List<Integer> list, int[] array, int length) {
        if (listIndex.size() == length) {
            lists.add(new ArrayList<>(list));
        } else {
            for (int j = 0; j < length; j++) {
                //如果当前索引已存在，跳过当前循环
                if (listIndex.contains(j)) {
                    continue;
                }
                //如果当前索引大于0并且相邻位置数据相同并且上一个数已处在
                if (j > 0 && array[j] == array[j - 1] && listIndex.contains(j - 1)) {
                    continue;
                }
                listIndex.add(j);
                list.add(array[j]);
                findAllNext(lists, listIndex, list, array, length);
                listIndex.remove(listIndex.size() - 1);
                list.remove(list.size() - 1);
            }
        }

    }

}
