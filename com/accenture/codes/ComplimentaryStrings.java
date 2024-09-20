package com.accenture.codes;

import java.util.Scanner;

public class ComplimentaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        complimentaryStrings(str1, str2);
    }

    public static void complimentaryStrings(String str1, String str2) {
        int[] charCount = new int[26];
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (int count : charCount) {
            if (count != 1) {
                System.out.print("No");
                System.exit(1);
            }
        }
        System.out.print("True");
    }
}