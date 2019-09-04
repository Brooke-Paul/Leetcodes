package com.learning;

import com.learning.entity.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author xuetao
 * @Description: 给定一个链表，判断链表中是否有环。
 * <p>
 * 进阶：
 * 你能否不使用额外空间解决此题？
 * @Date 2019-09-04
 * @Version 1.0
 */
public class LeetCode104 {


    private static boolean hasCycle(Node node) {
        Set set = new HashSet();
        while (node != null) {
            if (!set.add(node.value)) {
                return true;
            }

            node = node.next;
        }
        return false;
    }
}
