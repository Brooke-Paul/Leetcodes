package com.learning;

import com.learning.entity.Node;

/**
 * @Author xuetao
 * @Description: Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * ---------------------
 * @Date 2019-08-10
 * @Version 1.0
 */
public class LeetCode82 {
    /**
     * 上一题简便做法，明日解决
     *
     * @param args
     */
    public static void main(String[] args) {

        Node node = new Node(1, 1, 1, null);
        node.next = new Node(1, 1, 1, null);
        node.next.next = new Node(2, 2, 2, null);
        node.next.next.next = new Node(3, 3, 3, null);
        node.next.next.next.next = new Node(3, 3, 3, null);
        removeDuplicates(node);
    }

    private static void removeDuplicates(Node node) {
        Node first = new Node(0, 0, 0, null);
        Node firstTemp = first;
        Node temp = node;


        int value = 0;
        while (temp != null) {
            if ((int) temp.value != value) {
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
