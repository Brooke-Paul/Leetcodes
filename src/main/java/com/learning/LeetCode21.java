package com.learning;

import com.learning.entity.Node;

import java.util.Objects;

/**
 * @Author xuetao
 * @Description: 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * **输入：**1->2->4, 1->3->4
 * **输出：**1->1->2->3->4->4
 * @Date 2019-05-20
 * @Version 1.0
 */
public class LeetCode21 {

    /**
     * 链表合并
     *
     * @param args
     */
    public static void main(String[] args) {
        Node node = new Node(Objects.hashCode(1), 1, 1, null);
        node.next = new Node(Objects.hashCode(2), 2,2, null);
        node.next.next = new Node(Objects.hashCode(3),3,3, null);

        Node node1 = new Node(Objects.hashCode(1), 1, 1, null);
        node1.next = new Node(Objects.hashCode(3), 3,3, null);
        node1.next.next = new Node(Objects.hashCode(4),4,4, null);

        Node node2 = mergeTwoList(node, node1);
        while (node2!= null) {
            System.out.println(node2.value);
            node2 = node2.next;
        }
    }


    public static Node mergeTwoList(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if ((int) l1.value < (int) l2.value) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
    }
}
