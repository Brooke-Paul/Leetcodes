package com.learning.Number150;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: 在 O ( n log n ) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * <p>
 * 示例 2:
 * <p>
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 * @Date 2019-09-08
 * @Version 1.0
 */
public class LeetCode107 {

    public static void main(String[] args) {
        Node node = new Node(-1, -1, -1, null);
        node.next = new Node(5, 5, 5, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(4, 4, 4, null);
        node.next.next.next.next = new Node(0, 0, 0, null);
        Node result = mergeLinked(node);

        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }


    private static Node mergeLinked(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node temp = null;
        Node fast = node;
        Node slow = node;
        while (fast != null && fast.next != null) {
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;

        }
        temp.next = null;

        Node l1 = mergeLinked(node);
        Node l2 = mergeLinked(slow);

        return merge(l1, l2);
    }

    private static Node merge(Node l1, Node l2) {
        Node result = new Node(0, 0, 0, null);
        Node tmp = result;

        while (l1 != null && l2 != null) {
            if ((int) l1.value < (int) l2.value) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
            tmp = tmp.next;
        }

        if (l1 != null) {
            tmp.next = l1;
        }
        if (l2 != null) {
            tmp.next = l2;
        }
        return result.next;
    }
}
