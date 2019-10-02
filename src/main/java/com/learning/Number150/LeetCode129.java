package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统， 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下， 能够偷窃到的最高金额。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * <p>
 * 示例 2:
 * <p>
 * 输入: [2,99,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * @Date 2019-10-02
 * @Version 1.0
 */
public class LeetCode129 {
    public static void main(String[] args) {
        int[] array = {2,99,9,3,1};
        System.out.println(findMax(array));
    }

    private static int findMax(int[] array) {

        int length = array.length;

        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                max1 += array[i];
            } else {
                max2 += array[i];
            }
        }
        return Math.max(max1, max2);

    }
}
