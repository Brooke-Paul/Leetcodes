package com.learning;

import java.util.Objects;

/**
 * @Author xuetao
 * @Description: 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * <p>
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 * <p>
 * 进阶：
 * <p>
 * 你能尝试使用一趟扫描实现吗？
 * @Date 2019-05-16
 * @Version 1.0
 */
public class LeetCode19 {
    /**
     * 链表实现删除
     *
     * @param args
     */
    public static void main(String[] args) {
        Node node = new Node(Objects.hash(1), 1, 1, null);
        Node node1 = node;
        for (int i = 2; i < 6; i++) {
            if (node1.next == null) {
                node1 = node1.next = new Node(Objects.hash(i), i, i, null);
            }
        }
//        Node node2 = removeMethod1(node, 1);
        Node node2 = removeMethod2(node, 4);

        while (node2 != null) {
            System.out.println(node2.value);
            node2 = node2.next;
        }
    }

    /**
     * remove
     * 第一种方法： 暴力求解，获取链表长度并且获取正序排列的顺序移除
     *
     * @param node 链表
     * @param n    倒数第n个节点
     * @return
     */
    public static Node removeMethod1(Node node, int n) {
        int i = 0;
        Node node1 = node;
        while (node1 != null) {
            node1 = node1.next;
            i++;
        }
        System.out.println(i);
        if (n > i || n <= 0) {
            return null;
        }
        //倒数第n个表示正数 i - n + 1个。
        int j = 1;
        Node node2 = node;
        while (node2.next != null) {
            node2 = node2.next;
            j++;
            if (i - n == j) {
                node2.next = node2.next.next;
            }
        }

        return node;
    }

    /**
     * remove
     * 第二种方法：先遍历n。
     *
     * @param node 链表
     * @param n    倒数第n个节点
     * @return
     */
    public static Node removeMethod2(Node node, int n) {
        if (n <= 0) {
            return null;
        }
        Node node1 = node;
        Node node2 = node;

        for (int i = 0; i < n; i++) {
            node2 = node2.next;
        }
        if (node2 == null) {
            return node1;
        }


        while (node2.next != null) {
            node2 = node2.next;
            node1 = node1.next;
        }
        node1.next = node1.next.next;

        return node;
    }

}

class Node<K, V> {
    int hash;
    K key;
    V value;
    Node next;

    Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public final K getKey() {
        return key;
    }

    public final V getValue() {
        return value;
    }

    public final V setValue(V newValue) {
        V oldValue = value;
        value = newValue;
        return oldValue;
    }
}