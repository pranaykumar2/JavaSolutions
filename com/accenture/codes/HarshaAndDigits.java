package com.accenture.codes;

import java.util.Scanner;

public class HarshaAndDigits {
    public static int findRemainder(int n) {
        int firstDigit = getFirstDigit(n);
        int lastDigit = getLastDigit(n);
        if (lastDigit == 0) {
            return -1; // Division by zero is not allowed
        }
        return firstDigit % lastDigit;
    }
    private static int getFirstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }
    private static int getLastDigit(int n) {
        return n % 10;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n = scanner.nextInt();

        int remainder = findRemainder(n);
        if (remainder == -1) {
            System.out.println("Division by zero is not allowed.");
        } else {
            System.out.println("The remainder is: " + remainder);
        }
        scanner.close();
    }
}
