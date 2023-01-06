package com.yomo.suanfa.eazy;

import com.yomo.suanfa.node.ListNode;

/**
 * 给你一个链表的头节点 `head` ，判断链表中是否有环。
 *
 * @author yomo
 * @since 2023/1/6
 */
public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode proNode = new ListNode(0);
        ListNode nextNode;
        nextNode = proNode;

        for (int i = 0; i < 10; i++) {
            nextNode.next = new ListNode(i);
            nextNode = nextNode.next;
        }

        //nextNode.next = proNode;
        nextNode = proNode;

        System.out.println(hasCycle(nextNode));

    }

    public static boolean hasCycle(ListNode head) {
        // 快指针
        ListNode fast = head;
        // 慢指针
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            // 快指针一次走两步
            fast = fast.next.next;
            // 慢指针一次走一步
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}