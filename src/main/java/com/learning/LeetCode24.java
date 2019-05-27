package com.learning;

import com.learning.entity.Node;

import java.util.Objects;

/**
 * @Author xuetao
 * @Description: 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * <p>
 * 示例:
 * <p>
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * <p>
 * 说明:
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值 ，而是需要实际的进行节点交换。
 * @Date 2019-05-26
 * @Version 1.0
 */
public class LeetCode24 {


    public static void main(String[] args) {
        Node node = new Node(Objects.hashCode(1), 1, 1, null);
        node.next = new Node(Objects.hashCode(4), 4, 4, null);
        node.next.next = new Node(Objects.hashCode(5), 5, 5, null);
        node.next.next.next = new Node(Objects.hashCode(6), 6, 6, null);
        node.next.next.next.next = new Node(Objects.hashCode(7), 7, 7, null);
        Node result = changeLinkedSort(node);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    /**
     * 第一种方式 ，两两交换
     *
     * @param node
     * @return
     */
    public static Node changeLinkedSort(Node node) {
        Node head = new Node(Objects.hashCode(0), 0, 0, null);
        Node sort = head;
        while (node != null && node.next != null) {
            Node first = node;
            Node second = first.next;
            Node nextNode = second.next;
            first.next = null;

            head.next = second;
            head.next.next = first;

            head = head.next.next;
            //下移
            node = nextNode;
        }
        if (node != null) {
            head.next = node;
        }
        return sort.next;
    }
}
