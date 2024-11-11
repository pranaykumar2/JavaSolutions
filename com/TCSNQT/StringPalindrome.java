package com.TCSNQT;

import java.util.Scanner;

public class StringPalindrome {
    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.contentEquals(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        boolean check = isPalindrome(string);
        if (check) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}