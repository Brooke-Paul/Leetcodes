package com.learning.Number200;

import java.util.*;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * <p>
 * 例如，
 * <p>
 * 给定数组 [1,1,1,2,2,3] , 和 k = 2，返回 [1,2] 。
 * <p>
 * 注意：
 * <p>
 * 你可以假设给定的 k 总是合理的，1 ≤ k ≤ 数组中不相同的元素的个数。
 * 你的算法的时间复杂度 必须 优于 O( n log n ) , n 是数组的大小。
 * <p>
 * Created by xuetao on 2019/12/30
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode200 {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int k = 2;
        System.out.println(topK(array, k));
    }

    private static List topK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return null;
        }
        int len = array.length;
        Map<Integer, Integer> map = new HashMap<>(array.length);
        for (int i = 0; i < len; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        List[] bucket = new ArrayList[len];
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int value = e.getValue();

            if (bucket[value] == null) {
                bucket[value] = new ArrayList<Integer>();
            }
            bucket[value].add(e.getKey());
        }
        List<Integer> list = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && list.size() < k; i--) {
            if (bucket[i] != null) {
                for (int j = 0; j < bucket[i].size(); j++) {
                    list.add((int) bucket[i].get(j));
                }
            }
        }
        return list;
    }
}
