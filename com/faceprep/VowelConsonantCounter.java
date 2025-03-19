package com.faceprep;

import java.util.*;

public class VowelConsonantCounter {
    /**
     * Count vowels and consonants in a string
     */
    public static Map<String, Integer> countVowelsAndConsonants(String str) {
        Map<String, Integer> result = new HashMap<>();
        result.put("vowels", 0);
        result.put("consonants", 0);

        if (str == null || str.isEmpty()) {
            return result;
        }

        str = str.toLowerCase();
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        result.put("vowels", vowels);
        result.put("consonants", consonants);
        return result;
    }

    public static void execute(Scanner scanner) {
        System.out.print("Enter a string to count vowels and consonants: ");
        String input = scanner.nextLine();

        Map<String, Integer> counts = countVowelsAndConsonants(input);
        System.out.println("\"" + input + "\" contains:");
        System.out.println("Vowels: " + counts.get("vowels"));
        System.out.println("Consonants: " + counts.get("consonants"));
    }

    public static void main(String[] args) {
        execute(new Scanner(System.in));
    }
}