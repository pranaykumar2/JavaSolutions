package com.accenture.codes;

import java.util.Scanner;

public class JosephAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        josephAnagram(str1, str2);
    }

    public static void josephAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
