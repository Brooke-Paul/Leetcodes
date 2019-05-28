package com.learning;

import com.learning.entity.Node;

import java.util.Objects;

/**
 * @Author xuetao
 * @Description: 给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么将最后剩余节点保持原有顺序。
 * <p>
 * 示例 :
 * <p>
 * 给定这个链表： 1->2->3->4->5
 * <p>
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * <p>
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * <p>
 * 说明 :
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值 ，而是需要实际的进行节点交换。
 * @Date 2019-05-28
 * @Version 1.0
 */
public class LeetCode25 {
    public static void main(String[] args) {
        Node node = new Node(Objects.hashCode(1), 1, 1, null);
        node.next = new Node(Objects.hashCode(4), 4, 4, null);
        node.next.next = new Node(Objects.hashCode(5), 5, 5, null);
        node.next.next.next = new Node(Objects.hashCode(6), 6, 6, null);
        node.next.next.next.next = new Node(Objects.hashCode(7), 7, 7, null);
        Node result = reverseKGroup(node, 3);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    public static Node reverseKGroup(Node node, int k) {
        Node curr = node;
        int count = 0;
        while (curr != null && count != k) {
            curr = curr.next;
            count++;
        }



        if (count == k) {
            curr = reverseKGroup(curr, k);
            while (count-- > 0) {
                Node temp = node.next;
                node.next = curr;
                curr = node;
                node = temp;
            }
            node = curr;
        }

        return node;
    }

}
