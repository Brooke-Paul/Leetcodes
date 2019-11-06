package com.learning.Number200;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * <p>
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * @Date 2019-11-06
 * @Version 1.0
 */
public class LeetCode156 {

    public static void main(String[] args) {
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(2, 2, 2, null);
        node.next.next = new Node(2, 2, 3, null);
        node.next.next.next = new Node(2, 2, 3, null);
        node.next.next.next.next = new Node(1, 1, 2, null);
        node.next.next.next.next.next = new Node(1, 1, 1, null);
        System.out.println(isPalindrome(node));
    }

    private static boolean isPalindrome(Node node) {

        Node fast = node;
        Node slow = node;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node tail = reverse(slow.next);
        Node first = node;

        while (first != null && tail != null) {
            if (first.value != tail.value) {
                return false;
            }

            first = first.next;
            tail = tail.next;
        }

        return true;
    }


    /**
     * 反转链表
     *
     * @param node
     * @return
     */
    private static Node reverse(Node node) {

        Node pre = null;

        while (node != null) {
            Node next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

}
