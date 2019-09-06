package com.learning.Number100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定两个整数 n 和 k ，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * @Date 2019-08-02
 * @Version 1.0
 */
public class LeetCode76 {
    public static void main(String[] args) {
        int n = 4;
        int k = 4;
        combination(n, k);
    }

    private static void combination(int n, int k) {


        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            if (k == 1) {
                System.out.println(i);
                continue;
            }
            print(i, k, list, n);
        }

    }

    private static void print(int i, int k, List<Integer> list, int n) {
        for (int m = i + 1; m <= n; m++) {
            list.add(m);

            if (list.size() == k) {
                list.forEach(x -> System.out.print(x));
                System.out.println();
                list.remove(list.size() - 1);
                continue;
            }
        }


    }


}
