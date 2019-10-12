package com.learning.Number150;

import com.learning.entity.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * <p>
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * @Date 2019-10-12
 * @Version 1.0
 */
public class LeetCode137 {

    public static void main(String[] args) {
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(2, 2, 2, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(4, 4, 4, null);
        node.next.next.next.next = new Node(5, 5, 5, null);
        Node result = reverseLinked(node);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    /**
     * 反转链表 每次遍历交换当前两个数据位置
     *
     * @param node
     * @return
     */
    private static Node reverseLinked(Node node) {
        Node result = null;

        while (node != null) {
            Node next = node.next;
            node.next = result;
            result = node;
            node = next;
        }
        return result;

    }
}
