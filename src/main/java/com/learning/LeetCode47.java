package com.learning;

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
        int[] array = {1, 1, 2};
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
            Map map = new HashMap();
            map.put(0, i);
            findAllNext(lists, map, array, length);
        }

        lists.forEach(i -> {
            i.forEach(j -> System.out.print(j));
            System.out.println(" ");
        });

    }

    public static void findAllNext(List<List<Integer>> lists, Map map, int[] array, int length) {
        if (map.size() == length) {
            List list = new ArrayList();
            Set<Map.Entry> set = map.entrySet();
            Iterator<Map.Entry> iterator = set.iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                list.add(array[(Integer) entry.getValue()]);
            }
            if (!lists.contains(list)) {
                lists.add(list);
            }
        } else {
            for (int j = 0; j < length; j++) {
                if (!map.containsValue(j)) {
                    map.put(map.size(), j);
                    findAllNext(lists, map, array, length);
                    map.remove(map.size() - 1);
                }

            }
        }

    }

}
