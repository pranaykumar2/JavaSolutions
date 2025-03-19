package com.faceprep;

import java.util.*;

public class PermutationGenerator {
    /**
     * Generate all permutations of a string
     */
    public static List<String> getPermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.isEmpty()) {
            return result;
        }

        generatePermutations("", str, result);
        return result;
    }

    private static void generatePermutations(String prefix, String remaining, List<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            generatePermutations(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    result
            );
        }
    }

    public static void execute(Scanner scanner) {
        System.out.print("Enter a string to generate permutations (warning: long strings will generate many results): ");
        String input = scanner.nextLine();

        if (input.length() > 8) {
            System.out.print("The string is quite long and may generate millions of permutations. Continue? (y/n): ");
            String confirm = scanner.nextLine().toLowerCase();
            if (!confirm.equals("y") && !confirm.equals("yes")) {
                System.out.println("Operation cancelled.");
                return;
            }
        }

        List<String> permutations = getPermutations(input);
        System.out.println("Number of permutations: " + permutations.size());

        if (permutations.size() <= 100) {
            System.out.println("Permutations of \"" + input + "\":");
            for (String perm : permutations) {
                System.out.println(perm);
            }
        } else {
            System.out.print("Too many permutations to display. Show first 100? (y/n): ");
            String showMore = scanner.nextLine().toLowerCase();
            if (showMore.equals("y") || showMore.equals("yes")) {
                System.out.println("First 100 permutations:");
                for (int i = 0; i < 100; i++) {
                    System.out.println(permutations.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        execute(new Scanner(System.in));
    }
}