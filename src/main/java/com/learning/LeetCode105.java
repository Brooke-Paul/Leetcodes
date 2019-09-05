package com.learning;

import com.learning.entity.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null 。
 * <p>
 * 说明： 不允许修改给定的链表。
 * <p>
 * 进阶：
 * 你是否可以不用额外空间解决此题？
 * @Date 2019-09-05
 * @Version 1.0
 */
public class LeetCode105 {

    public static void main(String[] args) {
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(3, 3, 3, null);
        node.next.next = new Node(2, 2, 2, null);
        node.next.next.next = new Node(1, 1, 1, null);
        Node slow = firstCycle(node);
        while (slow != null) {
            System.out.println(slow.value);
            slow = slow.next;
        }
    }


    private static Node firstCycle(Node head) {

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                Node slow2 = head;
                while (slow2 != slow) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }
        return null;
    }

}
