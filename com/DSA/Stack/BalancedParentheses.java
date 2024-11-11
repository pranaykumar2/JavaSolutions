package com.DSA.Stack;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean parenCheck(String symbolString) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < symbolString.length(); i++) {
            if (symbolString.charAt(i) == '(') {
                st.push(symbolString.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(parenCheck("((()))"));  // expected true
        System.out.println(parenCheck("((()()))"));  // expected true
        System.out.println(parenCheck("(()"));  // expected false
        System.out.println(parenCheck(")("));  // expected false
    }
}
