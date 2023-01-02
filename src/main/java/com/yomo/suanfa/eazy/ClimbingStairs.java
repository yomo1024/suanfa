package com.yomo.suanfa.eazy;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @author yomo
 * @since 2023/1/2
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2, temp;
        for (int i = 3; i <= n; i++) {
            temp = a;
            a = b;
            b = temp + a;
        }
        return b;
    }
}
