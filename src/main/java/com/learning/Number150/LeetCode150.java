package com.learning.Number150;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author xuetao
 * @Description: 翻转一棵二叉树。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * <p>
 * 4
 * /
 * 2 7
 * / \ /
 * 1 3 6 9
 * <p>
 * 输出：
 * <p>
 * 4
 * /
 * 7 2
 * / \ /
 * 9 6 3 1
 * <p>
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 * <p>
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 * @Date 2019-10-30
 * @Version 1.0
 */
public class LeetCode150 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        treeNode.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(9);

        TreeNode t = invertTree(treeNode);

        System.out.println(t.val);
        sout(t.left);
        sout(t.right);

    }

    private static void sout(TreeNode t) {
        System.out.println(t.val);
        if (t.left != null) {
            sout(t.left);
        }
        if (t.right != null) {
            sout(t.right);
        }

    }


    /**
     * 翻转二叉树
     * @param root
     * @return
     */
    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();

            if (cur.left != null) {
                queue.offer(cur.left);
            }

            if (cur.right != null) {
                queue.offer(cur.right);
            }
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;



        }
        return root;

    }

}

