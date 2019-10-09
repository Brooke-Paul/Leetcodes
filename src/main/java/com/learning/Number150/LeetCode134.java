package com.learning.Number150;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 * @Date 2019-10-08
 * @Version 1.0
 */
public class LeetCode134 {
    public static void main(String[] args) {
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(2, 2, 2, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(2, 2, 2, null);
        node.next.next.next.next = new Node(3, 3, 3, null);
        int target = 3;
        Node first = removeNodeI(node, target);
        while (first != null) {
            System.out.println(first.value);
            first = first.next;
        }
    }

    /**
     * 方法一
     *
     * @param node
     * @param target
     * @return
     */
    private static Node removeNodeI(Node node, int target) {
        Node first = new Node(0, 0, 0, null);
        first.next = node;
        Node prev = first;
        Node current = first.next;
        while (current != null) {
            if ((int) current.value == target) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }
        return first.next;
    }
}
