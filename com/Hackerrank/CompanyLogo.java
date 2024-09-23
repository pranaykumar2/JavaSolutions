package com.Hackerrank;

import java.util.Scanner;

public class CompanyLogo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String companyName = input.nextLine();
        companyLogo(companyName);
    }

    public static void companyLogo(String companyName) {
        int[] charCount = new int[26];
        for (char c : companyName.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < 3; i++) {
            int max = 0;
            char ch = 'a';
            for (int j = 0; j < charCount.length; j++) {
                if (charCount[j] > max) {
                    max = charCount[j];
                    ch = (char) (j + 'a');
                }
            }
            System.out.println(ch + " " + max);
            charCount[ch - 'a'] = 0;
        }
    }
}
