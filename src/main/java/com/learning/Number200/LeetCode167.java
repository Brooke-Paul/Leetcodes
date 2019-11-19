package com.learning.Number200;

import java.util.Arrays;

/**
 * @Author xuetao
 * @Description: 给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 h 指数。
 * <p>
 * h指数的定义 : “一位有 h 指数的学者，代表他（她）的 N 篇论文中 至多 有 h 篇论文，分别被引用了 至少 h 次，其余的 N - h 篇论文每篇被引用次数 不多于 h 次。"
 * <p>
 * 示例:
 * <p>
 * 输入: citations = [3,0,6,1,5]
 * 输出: 3
 * 解释: 给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
 * 由于研究者有 3 篇论文每篇至少被引用了 3 次，其余两篇论文每篇被引用不多于 3 次，所以他的 h 指数是 3。
 * <p>
 * 说明: 如果 h 有多种可能的值， h 指数是其中最大的那个。
 * @Date 2019-11-19
 * @Version 1.0
 */
public class LeetCode167 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5};
        System.out.println(maxH(array));

    }

    private static int maxH(int[] array) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length;
        int mid = (left + right) / 2;
        return (right % 2 == 0 ? right + 1 : right) - mid;

    }

}
