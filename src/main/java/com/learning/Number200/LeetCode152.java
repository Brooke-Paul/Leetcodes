package com.learning.Number200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * <p>
 * 说明: 要求算法的时间复杂度为O(n)，空间复杂度为O(1)。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: [3]
 * <p>
 * 示例 2:
 * <p>
 * 输入: [1,1,1,3,3,2,2,2]
 * 输出: [1,2]
 * @Date 2019-11-02
 * @Version 1.0
 */
public class LeetCode152 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 3, 3, 2, 2, 2};
        System.out.println(find(array));

    }

    private static List<Integer> find(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        int len = array.length;

        int max = len / 3;

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            if (map.get(array[i]) > max) {
                list.add(array[i]);
            }
        }
        return list;

    }
}
