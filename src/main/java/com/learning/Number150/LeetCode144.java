package com.learning.Number150;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个整数数组，判断是否存在重复元素。
 * <p>
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: [1,2,3,4]
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 * @Date 2019-10-22
 * @Version 1.0
 */
public class LeetCode144 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println(isRepeat(array));
    }

    /**
     * 判断数组是否重复
     *
     * @param array
     * @return
     */
    private static boolean isRepeat(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }


        int len = array.length;
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(array[i])) {
                return true;
            }
            map.put(array[i], array[i]);
        }
        return false;

    }
}
