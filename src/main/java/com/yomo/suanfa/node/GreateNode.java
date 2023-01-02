package com.yomo.suanfa.node;

import java.util.ArrayList;

/**
 * @author yomo
 * @since 2022/10/17
 */
public class GreateNode {
    static ArrayList<Integer> tmp = new ArrayList<>();

    public static void main(String[] args) {
        ListNode proNode = new ListNode(0);
        ListNode nextNode;
        nextNode = proNode;

        for (int i = 1; i < 10; i++) {
            // 创建一个节点赋值给当前节点的下一个节点
            nextNode.next = new ListNode(i);
            // 将节点的指针向下移动
            nextNode = nextNode.next;
        }

        // 循环完毕，将指针重新指向头节点
        nextNode = proNode;

        // 遍历当前节点，获得数组
        int[] nums = show(nextNode);

        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static int[] show(ListNode nextNode) {
        if (nextNode == null) return new int[0];
        while (nextNode.next != null) {
            nextNode = nextNode.next;
            //System.out.println(nextNode.val);
            tmp.add(nextNode.val);
        }
        int[] nums = new int[tmp.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp.get(i);
        }
        return nums;
    }
}
