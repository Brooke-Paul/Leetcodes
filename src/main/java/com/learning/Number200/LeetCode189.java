package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 27
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: 0
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * 输入: 9
 * 输出: true
 * <p>
 * 示例 4:
 * <p>
 * 输入: 45
 * 输出: false
 * <p>
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 * <p>
 * Created by xuetao on 2019/12/16
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode189 {
    public static void main(String[] args) {
        System.out.println(power(36));
    }

    private static boolean power(int num) {
        if (num < 3) {
            return false;
        }
        while (num > 0) {
            int k = num % 3;
            num = num / 3;
            if (k == 0 && num == 1) {
                return true;
            }
        }
        return false;

    }
}
