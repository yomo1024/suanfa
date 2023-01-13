package com.yomo.suanfa.eazy;

import com.yomo.suanfa.node.ListNode;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 * @author yomo
 * @since 2023/1/8
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            // 将节点向下移动
            curr.next = prev;
            // 将节点交换
            prev = curr;
            // 推进
            curr = next;
        }
        return prev;
    }
}
