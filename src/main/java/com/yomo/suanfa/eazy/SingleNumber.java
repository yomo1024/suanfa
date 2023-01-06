package com.yomo.suanfa.eazy;

import java.util.Arrays;

/**
 * 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
 *
 * @author yomo
 * @since 2023/1/6
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce((a, b) -> a ^ b).getAsInt();
    }
}
