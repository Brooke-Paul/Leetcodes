package com.learning.Number150;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: 3
 * <p>
 * 示例 2:
 * <p>
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 * @Date 2019-09-22
 * @Version 1.0
 */
public class LeetCode120 {


    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 1, 2, 2};

        Map<Integer, Integer> map = new HashMap<>();
        int length = array.length;
        int mid = length / 2;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
            if (map.get(array[i]) > mid) {
                System.out.println(array[i]);
                return;
            }


        }
    }
}
