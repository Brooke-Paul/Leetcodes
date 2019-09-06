package com.learning.Number100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * <p>
 *                                                                 
 * <p>
 * 上图为 8 皇后问题的一种解法。
 * <p>
 * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
 * <p>
 * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * <p>
 * 示例:
 * <p>
 * 输入: 4
 * 输出: [
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
 * ---------------------
 * @Date 2019-07-02
 * @Version 1.0
 */
public class LeetCode51 {

    public static void main(String[] args) {
        List<List<String>> tempList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = 4;
        solve(n, 0, tempList, list);

        tempList.forEach(i -> System.out.println(i));
    }


    public static void solve(int n, int index, List<List<String>> tempList, List<Integer> list) {
        if (n == index) {
            List<String> tempStrList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                int col = list.get(i);
                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    if (j == col) {
                        sb.append('Q');
                    } else {
                        sb.append('.');
                    }
                }
                tempStrList.add(sb.toString());
            }
            tempList.add(tempStrList);
            return;
        }
        for (int col = 0; col < n; col++) {
            int row = index;
            int rowList;
            for (rowList = 0; rowList < list.size(); rowList++) {
                int rowrow = rowList;
                int colcol = list.get(rowrow);
                if (col == colcol) {
                    break;
                }
                if (Math.abs(rowrow - row) == Math.abs(colcol - col)) {
                    break;
                }
            }
            if (rowList == list.size()) {
                list.add(col);
                solve(n, index + 1, tempList, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
