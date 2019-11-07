package com.learning.Number200;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: 请编写一个函数，使其可以删除某个链表中给定的（非末尾的）节点，您将只被给予要求被删除的节点。
 * <p>
 * 比如：假设该链表为 1 -> 2 -> 3 -> 4 ，给定您的为该链表中值为 3 的第三个节点，那么在调用了您的函数之后，该链表则应变成 1 -> 2 -> 4 。
 * @Date 2019-11-07
 * @Version 1.0
 */
public class LeetCode157 {
    public static void main(String[] args) {
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(2, 2, 2, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(4, 4, 4, null);
        deleteNode(node.next.next);
        while (node != null) {
            System.out.println(node.value + "->");
            node = node.next;
        }
    }

    /**
     * 删除单个节点
     *
     * @param node
     */
    private static void deleteNode(Node node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }
}
