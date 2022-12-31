package com.yomo.suanfa.eazy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author yomo
 * @since 2022/12/31
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{";
        System.out.println(isValid(str));
    }

    /**
     * 判断字符串中括号是否为有效括号
     * @param str 目标字符串
     * @return 判断结果
     */
    private static boolean isValid(String str){
        Deque<Character> list = new LinkedList<>();
        for(char c : str.toCharArray()){
            if (c == '(') list.push(')');
            else if (c == '[') list.push(']');
            else if (c == '{') list.push('}');
            else if (list.isEmpty() || c != list.pop()) return false;
        }
        return list.isEmpty();
    }
}
