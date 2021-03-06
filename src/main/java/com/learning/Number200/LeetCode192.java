package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:给定一个未排序的数组，请判断这个数组中是否存在长度为3的递增的子序列。
 * <p>
 * 正式的数学表达如下:
 * <p>
 * 如果存在这样的 i, j, k, 且满足 0 ≤ i < j < k ≤ n -1，
 * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
 * 要求算法时间复杂度为O( n )，空间复杂度为O( 1 ) 。
 * <p>
 * 示例:
 * 输入 [1, 2, 3, 4, 5] ,
 * 输出 true .
 * <p>
 * 输入 [5, 4, 3, 2, 1] ,
 * 输出 false .
 * <p>
 * 致谢:
 * 特别感谢 @DjangoUnchained 添加这道题并创建所有测试用例。
 * <p>
 * Created by xuetao on 2019/12/22
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode192 {

    public static void main(String[] args) {
        int[] array = {2, 2, 3, 4};
        System.out.println(increasingQuence(array));
    }

    private static boolean increasingQuence(int[] array) {
        int length = array.length;

        if (length < 3) {
            return false;
        }
        for (int i = 0; i < length - 2; i++) {
            if (array[i] < array[i + 1] && array[i + 1] < array[i + 2] && (i + 2 <= length - 1)) {
                return true;
            }
        }
        return false;

    }
}
