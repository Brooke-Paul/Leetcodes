package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个整数 (32位有符整数型)，请写出一个函数来检验它是否是4的幂。
 * <p>
 * 示例:
 * 当 num = 16 时 ，返回 true 。 当 num = 5时，返回 false。
 * <p>
 * 问题进阶： 你能不使用循环/递归来解决这个问题吗？
 * <p>
 * 致谢:
 * 特别感谢 @yukuairoy 添加这个问题并创建所有测试用例。
 * <p>
 * Created by xuetao on 2019/12/26
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode196 {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(isPowerFour(n));
    }

    private static boolean isPowerFour(int n) {
        if (n < 4) {
            return false;
        }
        while (n != 1) {
            n = n >> 2;
            if (n % 4 != 0) {
                return false;
            }
        }
        return true;
    }
}
