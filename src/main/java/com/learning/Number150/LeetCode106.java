package com.learning.Number150;

import com.learning.entity.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 对链表进行插入排序。
 * <p>
 * <p>
 * 插入排序的动画演示如上。从第一个元素开始，该链表可以被认为已经部分排序（用黑色表示）。
 * 每次迭代时，从输入数据中移除一个元素（用红色表示），并原地将其插入到已排好序的链表中。
 * <p>
 * 插入排序算法：
 * <p>
 * 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
 * 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
 * 重复直到所有输入数据插入完为止。
 * 示例 1：
 * <p>
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * <p>
 * 示例 2：
 * <p>
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 * @Date 2019-09-06
 * @Version 1.0
 */
public class LeetCode106 {
    public static void main(String[] args) {
        Node node = new Node(1, 1, -1, null);
        node.next = new Node(5, 5, 5, null);
        node.next.next = new Node(3, 3, 3, null);
        node.next.next.next = new Node(4, 4, 4, null);
        node.next.next.next.next = new Node(0, 0, 0, null);
        Node result = sortLinked(node);

        while (result != null) {
            System.out.println(result.value);
            result = result.next;
        }
    }

    private static Node sortLinked(Node node) {

        List<Integer> integerList = new ArrayList<>();
        Node head = node;
        while (head != null) {
            integerList.add((Integer) head.value);
            head = head.next;
        }

        Integer[] array = (Integer[]) integerList.toArray(new Integer[integerList.size()]);
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }

            }
        }

        Node first = node;
        for (int i = 0; i < length; i++) {
            first.value = array[i];
            first = first.next;
        }
        return node;
    }
}
