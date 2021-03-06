package com.learning.Number250;

import java.util.*;

/**
 * Program Name: com.learning.Number250
 * Description: 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3, 2, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 第三大的数是 1.
 * <p>
 * 示例 2:
 * <p>
 * 输入: [1, 2]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 第三大的数不存在, 所以返回最大的数 2 .
 * <p>
 * 示例 3:
 * <p>
 * 输入: [2, 2, 3, 1]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
 * 存在两个值为2的数，它们都排第二。
 * Created by xuetao on 2020/2/19
 *
 * @author xuetao
 * @version 1.0
 */

public class LeetCode286 {
    public static void main(String[] args) {
        int[] array = {2, 2, 3, 1};
        System.out.println(findThirdNumber(array, 3));
    }

    private static int findThirdNumber(int[] array, int k) {
        Arrays.sort(array);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }
        if (list.size() == 0) {
            return 0;
        }
        if (k > list.size()) {
            return list.get(list.size() - 1);
        } else {
            return list.get(list.size() - k);
        }


    }
}
