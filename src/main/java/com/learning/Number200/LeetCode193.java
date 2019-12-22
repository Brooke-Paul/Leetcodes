package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:小偷又发现一个新的可行窃的地点。 这个地区只有一个入口，称为“根”。 除了根部之外，每栋房子有且只有一个父房子。 一番侦察之后，聪明的小偷意识到“这个地方的所有房屋形成了一棵二叉树”。 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 * <p>
 * 在不触动警报的情况下，计算小偷一晚能盗取的最高金额。
 * <p>
 * 示例 1:
 * <p>
 * 3
 * / \
 * 2 3
 * \ \
 * 3 1
 * <p>
 * 能盗取的最高金额 = 3 + 3 + 1 = 7 .
 * <p>
 * 示例 2:
 * <p>
 * 3
 * / \
 * 4 5
 * / \ \
 * 1 3 1
 * <p>
 * 能盗取的最高金额 = 4 + 5 = 9 .
 * <p>
 * 致谢:
 * 特别感谢 @dietpepsi 添加此题并创建所有测试用例。
 * <p>
 * Created by xuetao on 2019/12/22
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode193 {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(1);
        System.out.println(dps(node));
    }

    private static int dps(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int val = 0;
        if (node.left != null) {
            val += dps(node.left.left) + dps(node.left.right);
        }

        if (node.right != null) {
            val += dps(node.right.left) + dps(node.right.right);
        }
        return Math.max(val + node.val, dps(node.left) + dps(node.right));

    }
}
