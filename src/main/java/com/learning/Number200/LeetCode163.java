package com.learning.Number200;

import java.util.*;

/**
 * @Author xuetao
 * @Description: 给定一个整数数组 nums ，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
 * <p>
 * 示例 :
 * <p>
 * 输入: [1,2,1,3,2,5]
 * 输出: [3,5]
 * <p>
 * 注意：
 * <p>
 * 结果输出的顺序并不重要，对于上面的例子， [5, 3] 也是正确答案。
 * 你的算法应该具有线性时间复杂度。你能否仅使用常数空间复杂度来实现？
 * @Date 2019-11-15
 * @Version 1.0
 */
public class LeetCode163 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> integerEntry = iterator.next();
            if (integerEntry.getValue() <= 1) {
                System.out.println(integerEntry.getKey());
            }
        }
    }
}
