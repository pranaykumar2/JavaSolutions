package com.TCSNQT;

import java.util.Scanner;

public class StringAnagram {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (char ch : str1.toCharArray()) {
            arr1[ch - 'a']++;
        }
        for (char ch : str2.toCharArray()) {
            arr2[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        boolean check = isAnagram(str1, str2);
        if (check) {
            System.out.println("Anagram Strings");
        } else {
            System.out.println("Not Anagram Strings");
        }
    }
}