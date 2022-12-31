package com.yomo.suanfa.eazy;

import java.util.HashMap;

/**
 * @author yomo
 * @since 2022/12/31
 */
public class NumSum {

    final static int TARGET = 6;
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] returnNums = twoSum(nums);
        for (int returnNum : returnNums) {
            System.out.println(returnNum);
        }
    }

    /**
     * 求两数之和为目标值的两个数
     * @param nums 数组
     * @return 返回的两个数
     */
    private static int[] twoSum(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(NumSum.TARGET - nums[i]))
                return new int[]{map.get(NumSum.TARGET - nums[i]), i};
            map.put(nums[i],i);
        }
        return  new int[0];
    }
}
