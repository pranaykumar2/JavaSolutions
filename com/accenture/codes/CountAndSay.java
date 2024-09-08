package com.accenture.codes;

import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        char digit = prev.charAt(0);

        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == digit) {
                count++;
            } else {
                result.append(count).append(digit);
                digit = prev.charAt(i);
                count = 1;
            }
        }

        result.append(count).append(digit);
        return result.toString();
    }
}