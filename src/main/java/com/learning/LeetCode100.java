package com.learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 给定一个 非空 整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * <p>
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * @Date 2019-08-31
 * @Version 1.0
 */
public class LeetCode100 {
    public static void main(String[] args) {
        int[] array = {2, 2, 1};
        singleNum(array);
    }

    private static int singleNum(int[] array) {

        Set<Integer> set = new HashSet();

        for (int i = 0; i < array.length; i++) {
            if (!set.add(array[i])) {
                set.remove(array[i]);
            }
        }
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            System.out.println(i);
        }


        return 0;

    }
}
