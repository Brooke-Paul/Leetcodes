package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为 摆动序列。 第一个差（如果存在的话）可能是正数或负数。少于两个元素的序列也是摆动序列。
 * <p>
 * 例如， [1,7,4,9,2,5] 是一个摆动序列，因为差值 (6,-3,5,-7,3) 是正负交替出现的。相反, [1,4,7,2,5] 和 [1,7,4,5,5] 不是摆动序列，第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。
 * <p>
 * 给定一个整数序列，返回作为摆动序列的最长子序列的长度。 通过从原始序列中删除一些（也可以不删除）元素来获得子序列，剩下的元素保持其原始顺序。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,7,4,9,2,5]
 * 输出: 6
 * 解释: 整个序列就是一个摆动序列。
 * <p>
 * 输入: [1,17,5,10,13,15,10,5,16,8]
 * 输出: 7
 * 解释: 它的几个子序列满足摆动序列。其中一个是[1,17,10,13,10,16,8]。
 * <p>
 * 输入: [1,2,3,4,5,6,7,8,9]
 * 输出: 2
 * <p>
 * 进阶:
 * 你能否用 O( n ) 时间复杂度完成此题?
 * <p>
 * Created by xuetao on 2020/1/14
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode262 {
    public static void main(String[] args) {
        int[] array = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        System.out.println(maxLength(array));
    }

    private static int maxLength(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }
        int length = array.length;

        if (length < 2) {
            return length;
        }

        int preDiff = array[1] - array[0];
        int count = 2;
        for (int i = 2; i < length; i++) {
            int diff = array[i] - array[i - 1];

            if ((preDiff > 0 && diff < 0) || (preDiff < 0 && diff > 0)) {
                count++;
                preDiff = diff;
            }
        }
        return count;
    }
}
