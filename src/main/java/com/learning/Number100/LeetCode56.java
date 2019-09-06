package com.learning.Number100;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给出一个区间的集合，请合并所有重叠的区间。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,3],[2,6],[8,10],[15,18]]
 * 输出: [[1,6],[8,10],[15,18]]
 * 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * <p>
 * 示例 2:
 * <p>
 * 输入: [[1,4],[4,5]]
 * 输出: [[1,5]]
 * 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * @Date 2019-07-10
 * @Version 1.0
 */
public class LeetCode56 {
    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList();
        list.add(Arrays.asList(2, 6));
        list.add(Arrays.asList(1, 3));
        list.add(Arrays.asList(4, 10));
        list.add(Arrays.asList(15, 18));
        Collections.sort(list, (o1, o2) -> o1.get(0) - o2.get(0));

        list.forEach(i -> {
            i.forEach(o -> System.out.println(o));
        });
        List<List<Integer>> mergeList = merge(list);

        mergeList.forEach(i -> {
            i.forEach(o -> System.out.println(o));
        });
    }


    public static List<List<Integer>> merge(List<List<Integer>> list) {
        List<List<Integer>> result = new ArrayList<>();
        if (list.size() <= 1) {
            return list;
        }
        int length = list.size();
        for (int i = 0; i < length; i++) {
            List<Integer> integerList = list.get(i);

            int start = integerList.get(0);
            int end = integerList.get(1);

            while (i < length && list.get(i).get(0) <= end) {
                end = Math.max(list.get(i).get(0), end);
                i++;
            }
            result.add(Arrays.asList(start, end));
            i--;
        }
        return result;
    }
}
