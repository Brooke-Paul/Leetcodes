package com.learning.Number150;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 编写一个算法来判断一个数是不是“快乐数”。
 * <p>
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * <p>
 * 示例:
 * <p>
 * 输入: 19
 * 输出: true
 * 解释: 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * @Date 2019-10-07
 * @Version 1.0
 */
public class LeetCode133 {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(isHappy(num));
    }

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        Set<Integer> set = new HashSet();
        while (n != 1) {
            String str = String.valueOf(n);
            n = 0;
            for (int i = 0; i < str.length(); i++) {
                int temp = Character.getNumericValue(str.charAt(i));
                n += temp * temp;
            }
            if (n == 1) {
                return true;
            }
            if (!set.add(n)) {
                return false;
            }
        }
        return false;
    }
}
