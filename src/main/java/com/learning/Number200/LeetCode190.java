package com.learning.Number200;

import com.learning.entity.Node;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * <p>
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 * <p>
 * 示例 2:
 * <p>
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 * <p>
 * 说明:
 * <p>
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 * <p>
 * Created by xuetao on 2019/12/18
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode190 {
    public static void main(String[] args) {

        Node node = new Node(1, 1, 1, null);
        node.next = new Node(2, 2, 2, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(4, 4, 4, null);
        node.next.next.next.next = new Node(5, 5, 5, null);
        Node result = sortNode(node);
        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    private static Node sortNode(Node node) {
        Node temp = node;

        Node first = new Node(0, 0, 0, null);
        Node firstTemp = first;
        Node second = new Node(0, 0, 0, null);
        Node secondTemp = second;
        boolean state = true;
        while (temp != null) {
            if (state) {
                firstTemp.next = temp;
                firstTemp = firstTemp.next;
                state = false;
            } else {
                secondTemp.next = temp;
                secondTemp = secondTemp.next;
                state = true;
            }
            temp = temp.next;
        }
        second = second.next;
        while (second != null) {
            System.out.println(second.value);
            second = second.next;
        }


        return first.next;
    }
}
