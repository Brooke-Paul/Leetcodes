package com.learning.Number50;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,0]
 * 输出: 3
 * <p>
 * 示例 2:
 * <p>
 * 输入: [3,4,-1,1]
 * 输出: 2
 * <p>
 * 示例 3:
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * <p>
 * 说明:
 * <p>
 * 你的算法的时间复杂度应为O( n )，并且只能使用常数级别的空间。
 * @Date 2019-06-18
 * @Version 1.0
 */
public class LeetCode41 {
    /**
     * 解决思路：
     * 将大于0的数存入map
     * 获取数组中的最大值与数组长度比较
     * 如果map中不存在该数值，返回索引
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {0, 5, 4, 1, 0};
        System.out.println(findMissingNum(array));
    }

    public static int findMissingNum(int[] array) {
        Map<Integer, Boolean> map = new HashMap<>();
        int max = 0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] <= 0) {
                continue;
            } else {
                if (array[i] > max) {
                    max = array[i];
                }
                map.put(array[i], true);
            }
        }
        int maxL = Math.max(max, len);
        System.out.println(maxL);
        map.forEach((k, v) -> System.out.println(k + "::" + v));
        for (int j = 1; j <= maxL; j++) {

            if (map.get(j) == null) {
                return j;
            }
        }
        return 1;
    }

}
