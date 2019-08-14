package com.learning;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: 给定一个链表和一个特定值 x ，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 * <p>
 * 你应当保留两个分区中每个节点的初始相对位置。
 * <p>
 * 示例:
 * <p>
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 * @Date 2019-08-13
 * @Version 1.0
 */
public class LeetCode84 {
    public static void main(String[] args) {
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(4, 4, 4, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(2, 2, 2, null);
        node.next.next.next.next = new Node(5, 5, 5, null);
        node.next.next.next.next.next = new Node(2, 2, 2, null);
        int x = 3;
        splitList(node, x);
    }

    private static void splitList(Node node, int x) {
        Node head1 = new Node(0, 0, 0, null);
        Node head2 = new Node(0, 0, 0, null);

        Node n1 = head1;

        Node n2 = head2;

        Node first = node;
        while (first != null) {
            if ((int) first.value < x) {
                n1.next = first;
                n1 = n1.next;
            } else {
                n2.next = first;
                n2 = n2.next;
            }
            first = first.next;
        }
        n2.next = null;
        n1.next = head2.next;

        head1 = head1.next;
        while (head1 != null) {
            System.out.println(head1.value);
            head1 = head1.next;
        }
    }

}
