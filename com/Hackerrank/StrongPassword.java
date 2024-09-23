package com.Hackerrank;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String password = sc.nextLine();
        if (n != password.length()) {
            System.out.println("Invalid input");
            System.exit(1);
        }
        System.out.println(minimumCharactersToAdd(password));
    }

    public static int minimumCharactersToAdd(String password) {
        int n = password.length();
        int count = 0;
        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if ("!@#$%^&*()-+".indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        if (!hasDigit) {
            count++;
        }
        if (!hasLowerCase) {
            count++;
        }
        if (!hasUpperCase) {
            count++;
        }
        if (!hasSpecialChar) {
            count++;
        }

        if (n + count < 6) {
            count += 6 - (n + count);
        }

        return count;
    }
}
