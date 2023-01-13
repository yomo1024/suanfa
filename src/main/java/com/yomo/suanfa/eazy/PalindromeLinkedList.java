package com.yomo.suanfa.eazy;

import com.yomo.suanfa.node.ListNode;

/**
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 * @author yomo
 * @since 2023/1/12
 */
public class PalindromeLinkedList {
    private ListNode frontPointer;

    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            // 递归点，目的：遍历链表，判断：如果递归结果为TRUE那么翻转为FALSE
            if (!recursivelyCheck(currentNode.next))
                return false;
            // 判断当前节点是否等于前面的节点
            if (currentNode.val != frontPointer.val)
                return false;
            // 前面的节点如果等于递归里的节点，那么将前面的节点向后推
            frontPointer = frontPointer.next;
        }
        // 如果上面的都不满足，那么返回TRUE
        return true;
    }
}
