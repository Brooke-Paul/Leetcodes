package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 杨辉三角
 * @Date 2019-08-23
 * @Version 1.0
 */
public class LeetCode92 {

    public static void main(String[] args) {
        List<List<Integer>> lists = findList(5);
        lists.forEach(i -> System.out.println(i));
    }


    private static List<List<Integer>> findList(int num) {
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
        return lists;

    }
}
