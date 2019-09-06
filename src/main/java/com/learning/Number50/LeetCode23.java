package com.learning.Number50;

import com.learning.entity.Node;

import java.util.Objects;

/**
 * @Author xuetao
 * @Description: 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * @Date 2019-05-25
 * @Version 1.0
 */
public class LeetCode23 {

    public static void main(String[] args) {
        Node node = new Node(Objects.hashCode(1), 1, 1, null);
        node.next = new Node(Objects.hashCode(4), 4, 4, null);
        node.next.next = new Node(Objects.hashCode(5), 5, 5, null);

        Node node1 = new Node(Objects.hashCode(1), 1, 1, null);
        node1.next = new Node(Objects.hashCode(3), 3, 3, null);
        node1.next.next = new Node(Objects.hashCode(4), 4, 4, null);

        Node node2 = new Node(Objects.hashCode(2), 2, 2, null);
        node2.next = new Node(Objects.hashCode(6), 6, 6, null);


        Node[] nodes = new Node[3];
        nodes[0] = node;
        nodes[1] = node1;
        nodes[2] = node2;
        Node node3 = mergeSortedLinked(nodes, 0, nodes.length - 1);

        while (node3 != null) {
            System.out.println(node3.value);
            node3 = node3.next;
        }

    }

    /**
     * 采用分治法
     *
     * @param nodes
     * @param start
     * @param end
     * @return
     */
    public static Node mergeSortedLinked(Node[] nodes, int start, int end) {


        if (start == end) {
            return nodes[start];
        }
        int mid = (start + end) / 2;

        Node node1 = mergeSortedLinked(nodes, start, mid);
        Node node2 = mergeSortedLinked(nodes, mid + 1, end);


        Node headl = new Node(-1, -1, -1, null);
        Node ptr = headl;
        while (node1 != null && node2 != null) {
            if ((int) node1.value <= (int) node2.value) {
                ptr.next = node1;
                node1 = node1.next;
                ptr = ptr.next;
            } else {
                ptr.next = node2;
                node2 = node2.next;
                ptr = ptr.next;
            }
        }

        while (node1 != null) {
            ptr.next = node1;
            node1 = node1.next;
            ptr = ptr.next;
        }

        while (node2 != null) {
            ptr.next = node2;
            node2 = node2.next;
            ptr = ptr.next;
        }

        return headl.next;
    }
}



