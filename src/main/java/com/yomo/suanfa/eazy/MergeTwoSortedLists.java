package com.yomo.suanfa.eazy;

import com.yomo.suanfa.node.GreateNode;
import com.yomo.suanfa.node.ListNode;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * @author yomo
 * @since 2023/1/1
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        // 创建链表1
        ListNode proNode1 = new ListNode(0);
        ListNode nextNode1;
        nextNode1 = proNode1;
        int[] num1 = {1, 2, 4};
        for (int j : num1) {
            // 创建一个节点赋值给当前节点的下一个节点
            nextNode1.next = new ListNode(j);
            // 将节点的指针向下移动
            nextNode1 = nextNode1.next;
        }

        // 循环完毕，将指针重新指向头节点
        nextNode1 = proNode1;

        // 创建链表2
        ListNode proNode2 = new ListNode(0);
        ListNode nextNode2;
        nextNode2 = proNode2;
        int[] num2 = {1, 3, 4};
        for (int j : num2) {
            // 创建一个节点赋值给当前节点的下一个节点
            nextNode2.next = new ListNode(j);
            // 将节点的指针向下移动
            nextNode2 = nextNode2.next;
        }

        // 循环完毕，将指针重新指向头节点
        nextNode2 = proNode2;

        // 链表
        ListNode listNode = mergeTwoLists(nextNode1, nextNode2);

        int[] show = GreateNode.show(listNode);

        for (int i : show) {
            System.out.print(i + " ");
        }


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
