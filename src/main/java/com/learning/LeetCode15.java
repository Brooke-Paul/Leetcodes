package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个包含 n 个整数的数组 nums ，判断 nums 中是否存在三个元素 a，b，c ， 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意： 答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * @Date 2019-05-12
 * @Version 1.0
 */
public class LeetCode15 {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        threeSum(a);
    }

    public static List threeSum(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Arrays.sort(array);
        List arrayList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i] == array[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (j > i + 1 && array[j] == array[j - 1]) {
                    continue;
                }
                for (int m = j + 1; m < array.length; m++) {
                    if (m > j + 1 && array[m] == array[m - 1]) {
                        continue;
                    }
                    if (array[i] + array[j] + array[m] == 0) {

                        List list = new ArrayList();
                        list.add(array[i]);
                        list.add(array[j]);
                        list.add(array[m]);
                        arrayList.add(list);
                    }
                }
            }
        }

        if (arrayList.size() > 0) {
            arrayList.forEach(i -> System.out.print(i));
        }
        return arrayList;
    }

}
