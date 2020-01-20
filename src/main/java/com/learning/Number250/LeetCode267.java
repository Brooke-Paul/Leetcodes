package com.learning.Number250;

import com.learning.entity.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个单链表，随机选择链表的一个节点，并返回相应的节点值。保证每个节点 被选的概率一样 。
 * <p>
 * 进阶:
 * 如果链表十分大且长度未知，如何解决这个问题？你能否使用常数级空间复杂度实现？
 * <p>
 * 示例:
 * <p>
 * // 初始化一个单链表 [1,2,3].
 * ListNode head = new ListNode(1);
 * head.next = new ListNode(2);
 * head.next.next = new ListNode(3);
 * Solution solution = new Solution(head);
 * <p>
 * // getRandom()方法应随机返回1,2,3中的一个，保证每个元素被返回的概率相等。
 * solution.getRandom();
 * <p>
 * Created by xuetao on 2020/1/20
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode267 {
    private static Map<Integer, Node> map = new HashMap<>();
    private static Random random;

    public static void main(String[] args) {
        random = new Random();
        Node node = new Node(1, 1, 1, null);
        node.next = new Node(2, 2, 2, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(4, 4, 4, null);
        int i = 0;
        while (node != null) {
            map.put(i++, node);
            node = node.next;
        }

        getRandom();
        getRandom();
        getRandom();
        getRandom();
    }

    private static Node getRandom() {
        Node node = map.get(random.nextInt(map.size()));
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }
        System.out.println("........");
        return node;
    }
}
