package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: n 皇后问题研究的是如何将 n 个皇后放置在 n × n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * <p>
 * <p>
 * <p>
 * 上图为 8 皇后问题的一种解法。
 * <p>
 * 给定一个整数 n ，返回 n 皇后不同的解决方案的数量。
 * <p>
 * 示例:
 * <p>
 * 输入: 4
 * 输出: 2
 * 解释: 4 皇后问题存在如下两个不同的解法。
 * [
 * [".Q..",  // 解法 1
 * "...Q",
 * "Q...",
 * "..Q."],
 * <p>
 * ["..Q.",  // 解法 2
 * "Q...",
 * "...Q",
 * ".Q.."]
 * ]
 * @Date 2019-07-03
 * @Version 1.0
 */
public class LeetCode52 {

    public static void main(String[] args) {
        List<List<String>> tempList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = 5;
        solve(n, 0, tempList, list);
        System.out.println("tempList size   " + tempList.size());
        tempList.forEach(i -> System.out.println(i));
    }

    public static void solve(int n, int index, List<List<String>> tempList, List<Integer> list) {
        if (n == index) {
            List<String> tempStrList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuffer stringBuffer = new StringBuffer();
                int col = list.get(i);
                for (int j = 0; j < n; j++) {
                    if (col == j) {
                        stringBuffer.append("Q");
                    } else {
                        stringBuffer.append(".");
                    }
                }
                tempStrList.add(stringBuffer.toString());
            }
            tempList.add(tempStrList);
        }

        int row = index;
        for (int col = 0; col < n; col++) {
            int rowL;
            for (rowL = 0; rowL < list.size(); rowL++) {
                int colcol = list.get(rowL);

                if (col == colcol) {
                    break;
                }
                if (Math.abs(rowL - row) == Math.abs(colcol - col)) {
                    break;
                }
            }
            if (rowL == list.size()) {
                list.add(col);
                solve(n, index + 1, tempList, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
