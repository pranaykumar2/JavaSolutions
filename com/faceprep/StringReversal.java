package com.faceprep;

import java.util.Scanner;

public class StringReversal {
    /**
     * Reverse a string
     */
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void execute(Scanner scanner) {
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Reversed: \"" + reversed + "\"");
    }

    public static void main(String[] args) {
        execute(new Scanner(System.in));
    }
}
