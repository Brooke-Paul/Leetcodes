package com.learning.Number250;

import com.learning.entity.Node;
import com.learning.entity.TreeNode;


/**
 * Program Name: leetcodes
 * <p>
 * Description: 计算给定二叉树的所有左叶子之和。
 * <p>
 * 示例：
 * <p>
 * 3
 * /
 * 9 20
 * /
 * 15 7
 * <p>
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 * <p>
 * Created by xuetao on 2020/2/10
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode280 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(6);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.right = new TreeNode(8);
        System.out.println(sumOfLeftLeaves(treeNode));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }
        return dfs(root, result, false);
    }

    private static int dfs(TreeNode root, int result, boolean left) {
        if (root.left == null && root.right == null && left) {
            result += root.val;
            return result;
        }
        int leftResult = 0;
        if (root.left != null) {
            left = true;
            leftResult = dfs(root.left, result, left);
        }
        int rightResult = 0;
        if (root.right != null) {
            left = false;
            rightResult = dfs(root.right, result, left);
        }
        return leftResult + rightResult;
    }
}
