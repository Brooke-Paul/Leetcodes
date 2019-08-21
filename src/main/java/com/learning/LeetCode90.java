package com.learning;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * <p>
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 * @Date 2019-08-21
 * @Version 1.0
 */
public class LeetCode90 {


    public static void main(String[] args) {
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(2, 2, 2, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(4, 4, 4, null);
        node.next.next.next.next = new Node(5, 5, 5, null);
        int start = 2;
        int end = 4;
        reverseLinked(node, start, end);

    }

    /**
     * 反转链表
     *
     * @param node
     * @param m
     * @param n
     */
    private static void reverseLinked(Node node, int m, int n) {
        Node first = new Node(0, 0, 0, null);
        first.next = node;
        Node pre = first.next;
        for (int i = 1; i < m - 1; i++) {
            pre = pre.next;
        }
        Node start = pre.next;
        Node next = start.next;
        for (int i = 0; i < n - m; i++) {
            start.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = start.next;
        }


        first = first.next;
        while (first != null) {
            System.out.println(first.value);
            first = first.next;
        }


    }
}
