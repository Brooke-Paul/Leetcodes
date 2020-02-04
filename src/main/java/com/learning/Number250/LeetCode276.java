package com.learning.Number250;

import java.util.Map;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个正整数 n ，你可以做如下操作：
 * <p>
 * 1. 如果 n 是偶数，则用 n / 2 替换 n 。
 * 2. 如果 n 是奇数，则可以用 n + 1 或 n - 1 替换 n 。
 * n 变为 1 所需的最小替换次数是多少？
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * 8
 * <p>
 * 输出:
 * 3
 * <p>
 * 解释:
 * 8 -> 4 -> 2 -> 1
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * 7
 * <p>
 * 输出:
 * 4
 * <p>
 * 解释:
 * 7 -> 8 -> 4 -> 2 -> 1
 * 或
 * 7 -> 6 -> 3 -> 2 -> 1
 * <p>
 * Created by xuetao on 2020/2/3
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode276 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(smallestCount(n));
    }

    private static int smallestCount(int n) {
        int count = 0;
        while (n > 1) {
            count = (n % 2 == 0) ? count : count + 1;
            n = (n % 2 == 0) ? n : n - 1;
            n = n / 2;
            count++;
        }
        return count;
    }
}
