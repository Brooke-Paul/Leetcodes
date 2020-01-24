package com.learning.Number250;

import java.util.*;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个整数 n , 返回从 1 到 n 的字典顺序。
 * <p>
 * 例如，
 * <p>
 * 给定 n =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。
 * <p>
 * 请尽可能的优化算法的时间复杂度和空间复杂度。 输入的数据 n 小于等于 5,000,000。
 * <p>
 * Created by xuetao on 2020/1/23
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode270 {


    public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList();
        int i = 1;
        while (true) {
            result.add(i);
            if (i * 10 <= n) {
                i *= 10;
            } else {
                while (i % 10 == 9 || i == n) {
                    i /= 10;
                }
                if (i == 0) {
                    return result;
                }
                i++;
            }
        }
    }

    public static List<Integer> lexicalOrder_LTE_by_10458(int n) {
        List<Integer> result = new ArrayList();
        int insertPosition = 0;
        return addNumbers(result, 1, insertPosition, n);
    }

    private static List<Integer> addNumbers(List<Integer> result, int insertNumber, int insertPosition, int n) {
        int i;
        for (i = 0; i < 9; i++) {
            if (insertNumber + i > n) {
                return result;
            }
            result.add(insertPosition + i, insertNumber + i);
            if ((insertNumber + i) % 10 == 0 && (insertNumber + i) == (insertNumber + 10)) {
                break;
            }
        }
        while ((insertNumber + i) % 10 != 0 && (insertNumber + i) <= n) {
            result.add(insertPosition + i, insertNumber + i);
            i++;
        }
        //find next insert position:
        insertPosition = result.indexOf((insertNumber + i) / 10);
        return addNumbers(result, insertNumber + i, insertPosition + 1, n);
    }

    public static void main(String... strings) {
        long lStartTime = new Date().getTime();

        List<Integer> result = lexicalOrder_LTE_by_10458(500000);
//        List<Integer> result = lexicalOrder_LTE_by_10458(14959);
        long lEndTime = new Date().getTime();
        long difference = lEndTime - lStartTime;
        System.out.println("Elapsed milliseconds: " + difference);
        System.out.println("result size is: " + result.size());
//        CommonUtils.printList(result);
    }


    public static List<Integer> lexicalOrder_TLE_by_23489(int n) {
        List<Integer> result = new ArrayList();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        Collections.sort(result, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1);
                String s2 = String.valueOf(o2);
                return s1.compareTo(s2);
            }
        });
        return result;
    }
}
