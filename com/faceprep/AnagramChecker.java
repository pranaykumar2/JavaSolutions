package com.faceprep;

import java.util.Scanner;

public class AnagramChecker {
    /**
     * Check if two strings are anagrams
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        // Using character counting
        int[] counts = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Only count alphabetic characters
            if (c1 >= 'a' && c1 <= 'z') {
                counts[c1 - 'a']++;
            }

            if (c2 >= 'a' && c2 <= 'z') {
                counts[c2 - 'a']--;
            }
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void execute(Scanner scanner) {
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        boolean result = areAnagrams(str1, str2);
        if (result) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    public static void main(String[] args) {
        execute(new Scanner(System.in));
    }
}