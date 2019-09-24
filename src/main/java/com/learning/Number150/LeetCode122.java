package com.learning.Number150;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author xuetao
 * @Description: 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
 * <p>
 * 调用 next() 将返回二叉搜索树中的下一个最小的数。
 * <p>
 * 注意: next() 和 hasNext() 操作的时间复杂度是O(1)，并使用 O(h) 内存，其中 h 是树的高度。
 * @Date 2019-09-24
 * @Version 1.0
 */
public class LeetCode122 {
    private static Queue<Integer> queue;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);


        queue = new LinkedList<>();
        if (root != null) {
            dfs(root, queue);
        }
    }

    /**
     * 遍历时先左边后右边， 放入队列
     *
     * @param root
     * @param q
     */
    private static void dfs(TreeNode root, Queue<Integer> q) {
        if (root.left != null) {
            dfs(root.left, q);
        }
        q.offer(root.val);
        if (root.right != null) {
            dfs(root.right, q);
        }
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

    public int next() {
        return queue.poll();
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    Integer val;

    public TreeNode(int val) {
        this.val = val;
    }
}
