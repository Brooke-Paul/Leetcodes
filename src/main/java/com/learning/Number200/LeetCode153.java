package com.learning.Number200;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * <p>
 * 说明：
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: root = [3,1,4,null,2], k = 1
 * 输出: 1
 * <p>
 * 示例 2:
 * <p>
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 * 输出: 3
 * <p>
 * 进阶：
 * 如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化 kthSmallest 函数？
 * @Date 2019-11-03
 * @Version 1.0
 */
public class LeetCode153 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        int k = 1;
        List<Integer> list = new ArrayList();

        findSmallestK(root, list);

        System.out.println(list.get(k - 1));
    }

    private static void findSmallestK(TreeNode treeNode, List<Integer> list) {
        if (treeNode == null) {
            return;
        }

        if (treeNode.left != null) {
            findSmallestK(treeNode.left, list);
        }
        list.add(treeNode.val);

        if (treeNode.right != null) {
            findSmallestK(treeNode.right, list);
        }
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
