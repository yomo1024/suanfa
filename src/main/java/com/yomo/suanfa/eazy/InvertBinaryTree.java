package com.yomo.suanfa.eazy;

import com.yomo.suanfa.node.TreeNode;

/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 *
 * @author yomo
 * @since 2023/1/11
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        // 交换左右子树
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;

        // 递归交换当前节点的左子树
        invertTree(root.left);
        // 递归交换当前节点的右子树
        invertTree(root.right);

        return root;
    }
}
