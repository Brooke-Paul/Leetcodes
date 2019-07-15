package com.learning;

import com.learning.entity.Node;

import java.util.Objects;

/**
 * @Author xuetao
 * @Description: 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * <p>
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 * @Date 2019-07-15
 * @Version 1.0
 */
public class LeetCode61 {
    public static void main(String[] args) {
        Node node = new Node(Objects.hashCode(1), 1, 1, null);
        node.next = new Node(Objects.hashCode(2), 2, 2, null);
        node.next.next = new Node(Objects.hashCode(3), 3, 3, null);
        node.next.next.next = new Node(Objects.hashCode(4), 4, 4, null);
        node.next.next.next.next = new Node(Objects.hashCode(5), 5, 5, null);
        Node temp = node;

        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        System.out.println("链表长度" + length);

        int k = 6;

        int m = Math.abs(length - k);
        int n = m;
        Node first = null;
        Node tempNode = node;
        if (m == 0) {
            first = node;
        } else {
            while (m >= 1) {
                m--;
                tempNode = tempNode.next;
            }
            first = tempNode;

            Node tempFirst = first;
            while (tempFirst.next != null) {
                tempFirst = tempFirst.next;
            }
            while (node != null && n > 0) {
                tempFirst.next = node;
                tempFirst = tempFirst.next;
                node = node.next;
                n--;
            }
            tempFirst.next = null;
        }

        while (first != null) {
            System.out.println(first.value);
            first = first.next;
        }


    }


}