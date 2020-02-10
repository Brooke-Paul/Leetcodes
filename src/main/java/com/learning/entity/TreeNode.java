package com.learning.entity;

/**
 * Program Name: leetcodes
 * <p>
 * Description:
 * <p>
 * Created by xuetao on 2020/2/10
 *
 * @author xuetao
 * @version 1.0
 */
public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public Integer val;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }
}
