package com.learning.Number200;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。
 * <p>
 * 例如，
 * <p>
 * [2,3,4] 的中位数是 3
 * <p>
 * [2,3] 的中位数是 (2 + 3) / 2 = 2.5
 * <p>
 * 设计一个支持以下两种操作的数据结构：
 * <p>
 * void addNum(int num) - 从数据流中添加一个整数到数据结构中。
 * double findMedian() - 返回目前所有元素的中位数。
 * 示例：
 * <p>
 * addNum(1)
 * addNum(2)
 * findMedian() -> 1.5
 * addNum(3)
 * findMedian() -> 2
 * <p>
 * Created by xuetao on 2019/12/3
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode177 {
    private Queue<Long> large;
    private Queue<Long> small;

    public static void main(String[] args) {
        LeetCode177 leetCode177 = new LeetCode177();
        leetCode177.addNum(1);
        leetCode177.addNum(2);
        leetCode177.addNum(3);
        System.out.println(leetCode177.findMedian());
        leetCode177.addNum(4);
        leetCode177.addNum(5);
        System.out.println(leetCode177.findMedian());
    }

    public LeetCode177() {
        large = new PriorityQueue<>();
        small = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        large.offer((long) num);
        small.offer(large.poll());
        if (large.size() < small.size()) {
            large.offer(small.poll());
        }
    }

    public double findMedian() {
        if (large.size() > small.size()) {
            return large.peek();
        }
        return (large.peek() + small.peek()) / 2.0;
    }
}
