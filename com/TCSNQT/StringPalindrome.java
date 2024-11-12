package com.TCSNQT;

import java.util.Scanner;

public class StringPalindrome {
        public static boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;

            while (left < right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);

                if (!Character.isLetterOrDigit(leftChar)) {
                    left++;
                    continue;
                }
                if (!Character.isLetterOrDigit(rightChar)) {
                    right--;
                    continue;
                }

                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }

                left++;
                right--;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String string = input.nextLine();
        boolean check = isPalindrome(" ");
        if (check) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
    }
}