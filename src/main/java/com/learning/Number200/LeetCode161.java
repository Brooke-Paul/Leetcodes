package com.learning.Number200;

import com.learning.entity.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1
 * /
 * 2 3
 * <p>
 * 5
 * <p>
 * 输出: ["1->2->5", "1->3"]
 * <p>
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 * @Date 2019-11-12
 * @Version 1.0
 */
public class LeetCode161 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        List<String> list = new ArrayList<>();
        dfs(list, treeNode, "");
        list.forEach(i -> System.out.println(i));
    }

    /**
     * 递归遍历
     *
     * @param strings
     * @param treeNode
     */
    public static void dfs(List<String> strings, TreeNode treeNode, String data) {
        if (treeNode.left == null && treeNode.right == null) {
            strings.add(data + treeNode.val + "");
        }

        if (treeNode.left != null) {
            dfs(strings, treeNode.left, data + treeNode.val + "->");
        }

        if (treeNode.right != null) {
            dfs(strings, treeNode.right, data + treeNode.val + "->");
        }

    }
}
