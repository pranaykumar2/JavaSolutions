package com.faceprep;

import java.util.*;

public class DuplicateRemover {
    /**
     * Remove duplicate characters from a string
     */
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void execute(Scanner scanner) {
        System.out.print("Enter a string to remove duplicates: ");
        String input = scanner.nextLine();

        String result = removeDuplicates(input);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Without duplicates: \"" + result + "\"");
    }

    public static void main(String[] args) {
        execute(new Scanner(System.in));
    }
}