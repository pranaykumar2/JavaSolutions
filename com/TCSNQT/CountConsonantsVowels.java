package com.TCSNQT;

import java.util.Scanner;

public class CountConsonantsVowels {
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int vowels = countVowels(str);
        System.out.println("Vowels = " + vowels + " and Consonants = " + (str.length() - vowels));
    }
}
