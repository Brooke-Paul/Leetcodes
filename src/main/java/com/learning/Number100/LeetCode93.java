package com.learning.Number100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 杨辉三角 二 ，返回第 n 列
 * @Date 2019-08-24
 * @Version 1.0
 */
public class LeetCode93 {
    public static void main(String[] args) {
        List<Integer> lists = findList(20);
        lists.forEach(i -> System.out.println(i));
    }


    private static List<Integer> findList(int num) {
        List<List<Integer>> lists = new ArrayList<>(num);
        List list = null;
        if (num >= 1) {
            list = new ArrayList();
            list.add(1);
            lists.add(list);
        }
        int m = 0;
        for (int i = 2; i <= num; i++) {
            list = new ArrayList(i);
            list.add(1);

            for (int j = 1; j <= m; j++) {
                list.add(lists.get(m).get(j - 1) + lists.get(m).get(j));
            }
            list.add(1);


            lists.add(list);
            m++;
        }
        return lists.get(m);

    }

}
