package com.learning.Number250;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定两个数组，写一个方法来计算它们的交集。
 * <p>
 * 例如:
 * 给定 nums1 = [1, 2, 2, 1] , nums2 = [2, 2] , 返回 [2, 2] .
 * <p>
 * 注意：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 跟进:
 * <p>
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，你不能一次加载所有的元素到内存中，你该怎么办？
 * <p>
 * Created by xuetao on 2020/1/2
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode252 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {3, 4};
        System.out.println(intersectionArray(num1, num2));
    }


    private static List<Integer> intersectionArray(int[] num1, int[] num2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num1.length; i++) {
            map.put(num1[i], map.getOrDefault(num1[i], 0) + 1);
        }
        List<Integer> al = new ArrayList<Integer>();
        for (int i = 0, val; i < num2.length; i++) {
            if (map.containsKey(num2[i]) && (val = map.get(num2[i])) > 0) {
                al.add(num2[i]);
                map.put(num2[i], --val);
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i : al) {
            result.add(i);
        }
        return result;
    }
}
