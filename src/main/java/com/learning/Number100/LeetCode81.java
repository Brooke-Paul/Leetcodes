package com.learning.Number100;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 * @Date 2019-08-09
 * @Version 1.0
 */
public class LeetCode81 {
    public static void main(String[] args) {
//        Node node = new Node(1, 1, 1, null);
//        node.next = new Node(2, 2, 2, null);
//        node.next.next = new Node(3, 3, 3, null);
//        node.next.next.next = new Node(3, 3, 3, null);
//        node.next.next.next.next = new Node(4, 4, 4, null);
//        node.next.next.next.next.next = new Node(4, 4, 4, null);
//        node.next.next.next.next.next.next = new Node(5, 5, 5, null);

        Node node = new Node(1, 1, 1, null);
        node.next = new Node(1, 1, 1, null);
        node.next.next = new Node(2, 2, 2, null);
        node.next.next.next = new Node(3, 3, 3, null);
        node.next.next.next.next = new Node(4, 4, 4, null);
        removeDuplicates(node);
    }

    private static void removeDuplicates(Node node) {
        Node first = new Node(0, 0, 0, null);
        Node firstTemp = first;
        Node temp = node;


        int value = 0;
        while (temp != null) {

            if ((int) temp.value != value &&
                    (temp.next != null && temp.value != temp.next.value || temp.next == null)) {
                firstTemp.next = temp;
                firstTemp = firstTemp.next;
            } else {
                firstTemp.next = null;
            }
            value = (int) temp.value;
            temp = temp.next;

        }
        node = first.next;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;

        }

    }

}
