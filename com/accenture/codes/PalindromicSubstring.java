package com.accenture.codes;

import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        palindromicSubstring(str);
    }
    public static void palindromicSubstring(String str) {
        String longestSubstr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) {
                String subStr = str.substring(i, j);
                if (isPalindrome(subStr)) {
                    if (subStr.length() > longestSubstr.length()) {
                        longestSubstr = subStr;
                    }
                }
            }
        }
        System.out.println(longestSubstr);
    }
    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
