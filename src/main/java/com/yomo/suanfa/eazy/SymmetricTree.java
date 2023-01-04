package com.yomo.suanfa.eazy;

import com.yomo.suanfa.node.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 *
 * @author yomo
 * @since 2023/1/4
 */
public class SymmetricTree {
    public boolean isSymmetric1(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return true;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (queue.size() > 0){
            TreeNode left = queue.removeFirst();
            TreeNode right = queue.removeFirst();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }
    public boolean isSymmetric2(TreeNode root) {
        if (root == null) return true;
        return isSymmetry(root.left, root.right);
    }

    private boolean isSymmetry(TreeNode leftTree, TreeNode rightTree) {
        if (leftTree == null && rightTree == null)
            return true;
        if (leftTree == null || rightTree == null || leftTree.val != rightTree.val)
            return false;
        return isSymmetry(leftTree.left, rightTree.right) && isSymmetry(leftTree.right, rightTree.left);
    }
}
