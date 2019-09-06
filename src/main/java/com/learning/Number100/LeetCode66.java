package com.learning.Number100;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定一个 非负整数 组成的 非空 数组，在该数的基础上加一，返回一个新的数组。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * @Date 2019-07-21
 * @Version 1.0
 */
public class LeetCode66 {
    public static void main(String[] args) {

        int[] array = {4,3,2,1};
        int length = array.length;
        int[] result = new int[length];
        boolean temp = false;
        for (int j = length - 1; j >= 0; j--) {
            if (j == length - 1) {
                if (array[j] + 1 == 10) {
                    temp = true;
                    result[j] = 0;
                } else {
                    temp = false;
                    result[j] = array[j] + 1;
                }
            }

            if (j != length - 1) {
                int m = (array[j] + ((temp == true) ? 1 : 0)) % 10;
                temp = m != 0 ? false : true;
                result[j] = m;
            }
        }
        if (result[0] == 0 && temp == true) {
            result = Arrays.copyOf(result, result.length + 1);
            result[0] = 1;
        }


        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x]);
        }
    }
}
