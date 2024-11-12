package com.accenture.codes;

import java.util.Scanner;

public class NumberToAlphabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String N = input.nextLine();
        numberToAlphabets(N);
    }

    static void numberToAlphabets(String N) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) != '0') {
                result.append((char) (N.charAt(i) + 48));
            }
        }
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '0') {
                result.append('0');
            }
        }
        System.out.println(result);
    }
}
