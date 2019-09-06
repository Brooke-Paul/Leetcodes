package com.learning.Number150;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 给定一个 非空 整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,3,2]
 * 输出: 3
 * <p>
 * 示例 2:
 * <p>
 * 输入: [0,1,0,1,0,1,99]
 * 输出: 99
 * @Date 2019-09-02
 * @Version 1.0
 */
public class LeetCode101 {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 2};
        System.out.println(singleNum(array));
    }

    private static int singleNum(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        int length = array.length;

        for (int i = 0; i < length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() != 3) {
                return entry.getKey();
            }

        }
        return 0;
    }
}
