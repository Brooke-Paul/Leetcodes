package com.learning.Number100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给出一个 无重叠的 ， 按照区间起始端点排序的区间列表。
 * <p>
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 * <p>
 * 示例 1:
 * <p>
 * 输入: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * 输出: [[1,5],[6,9]]
 * <p>
 * 示例 2:
 * <p>
 * 输入: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * 输出: [[1,2],[3,10],[12,16]]
 * 解释: 这是因为新的区间 [4,8] 与 [3,5],[6,7],[8,10] 重叠。
 * @Date 2019-07-11
 * @Version 1.0
 */
public class LeetCode57 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList();

//        list.add(Arrays.asList(1, 2));
//        list.add(Arrays.asList(3, 5));
//        list.add(Arrays.asList(6, 7));
//        list.add(Arrays.asList(8, 10));
//        list.add(Arrays.asList(12, 16));


        list.add(Arrays.asList(1, 4));
        list.add(Arrays.asList(6, 9));
        Collections.sort(list, (o1, o2) -> o1.get(0) - o2.get(0));

        List<Integer> newInterval = Arrays.asList(5, 8);

        List<List<Integer>> results = new ArrayList<>();
        merge(list, newInterval, results);

        results.forEach(i -> {
            i.forEach(o -> System.out.println(o));
        });

    }

    public static void merge(List<List<Integer>> lists, List<Integer> newInterval, List<List<Integer>> results) {
        int length = lists.size();

        for (int i = 0; i < length; i++) {
            List<Integer> indexList = lists.get(i);
            int start = indexList.get(0);
            int end = indexList.get(1);

            if (end < newInterval.get(0) || newInterval.get(1) < start) {
                results.add(Arrays.asList(start, end));
                continue;
            }


            int min = Math.min(start, newInterval.get(0));
            int max = Math.max(end, newInterval.get(1));
            while (i < length &&
                    ((newInterval.get(0) >= lists.get(i).get(0) && newInterval.get(0) <= lists.get(i).get(1))
                            || (newInterval.get(1) >= lists.get(i).get(0)))) {
                min = Math.min(min, lists.get(i).get(0));
                max = Math.max(max, lists.get(i).get(1));
                i++;
            }
            results.add(Arrays.asList(min, max));
            i--;
        }
    }
}
