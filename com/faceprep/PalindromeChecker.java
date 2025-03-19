package com.faceprep;

import java.util.Scanner;

public class PalindromeChecker {
    /**
     * Check if a string is palindrome
     */
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void execute(Scanner scanner) {
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);
        if (result) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        execute(new Scanner(System.in));
    }
}