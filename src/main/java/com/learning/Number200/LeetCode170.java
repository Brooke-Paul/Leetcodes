package com.learning.Number200;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定正整数 n ，找到若干个完全平方数（比如 1, 4, 9, 16, ... ）使得它们的和等于 n 。你需要让组成和的完全平方数的个数最少。
 * <p>
 * 示例 1:
 * <p>
 * 输入: n = 12
 * 输出: 3
 * 解释: 12 = 4 + 4 + 4.
 * <p>
 * 示例 2:
 * <p>
 * 输入: n = 13
 * 输出: 2
 * 解释: 13 = 4 + 9.
 * @Date 2019-11-23
 * @Version 1.0
 */
public class LeetCode170 {
    public static void main(String[] args) {

        int target = 154;
        int n = (int) Math.sqrt(154);
        List<List<Integer>> lists = new ArrayList<>();

        System.out.println(findMinNum(lists, new ArrayList<>(), n, target));
        System.out.println(lists);

        System.out.println(findMinNumII(n));

    }


    private static int findMinNum(List<List<Integer>> lists, List<Integer> list, int n, int target) {
        for (int j = n; j >= 2; j--) {
            int min = target - (int) Math.pow(j, 2);
            if (min < 0) {
                continue;
            } else if (min > 3) {
                list.add((int) Math.pow(j, 2));
                findMinNum(lists, list, n, min);
                list.remove(list.size() - 1);
            } else if (min <= 3) {
                list.add((int) Math.pow(j, 2));
                for (int x = min; x > 0; x--) {
                    list.add(1);
                }
                if (lists.size() == 0) {
                    lists.add(new ArrayList<>(list));
                } else if (list.size() < lists.get(0).size()) {
                    lists.remove(0);
                    lists.add(new ArrayList<>(list));
                }
                for (int x = min; x > 0; x--) {
                    list.remove(1);
                }
                list.remove(list.size() - 1);

                return lists.get(0).size();
            }
        }
        return lists.isEmpty() ? 0 : lists.get(0).size();
    }

    /**
     * 方法二
     *
     * @param n
     * @return
     */
    private static int findMinNumII(int n) {
        int result = n;
        int num = 2;
        while (num * num <= n) {
            int temp1 = n / (num * num);
            int temp2 = n % (num * num);
            result = Math.min(result, temp1 + findMinNumII(temp2));
            num++;
        }
        return result;
    }


}
