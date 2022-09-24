package com.yomo.suanfa.eazy;

import java.util.ArrayList;

/**
 * 题目：输入头节点，从尾到头打印节点（用数组返回每个节点的值）
 * @author yomo
 * @since 2022/8/12
 */
public class LianBiao {
    final static int LEN = 10;
    static ArrayList<Integer> tmp = new ArrayList<>();

    public static void main(String[] args) {
        // 创建首节点
        ListNode nodeSta = new ListNode(0);
        // 声明一个变量用来在移动过程中指向当前节点
        ListNode nextNode;
        // 指向首节点
        nextNode = nodeSta;

        // 创建链表
        for (int i = 1; i < LEN; i++) {
            // 生成新的节点
            // 把心节点连起来
            nextNode.next = new ListNode(i);
            // 当前节点往后移动
            nextNode = nextNode.next;
        }
        // 当for循环完成之后 nextNode指向最后一个节点，
        // 重新赋值让它指向首节点
        nextNode = nodeSta;
        // 逆向输出
        int[] num = show(nextNode);
        for (int i : num) {
            System.out.println(i);
        }

    }

    private static int[] show(ListNode node) {
        if (node == null) {
            return new int[0];
        }
        show(node.next);
        tmp.add(node.val);
        int[] res = new int[tmp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode [next=" + next + ", val=" + val + "]";
    }

}