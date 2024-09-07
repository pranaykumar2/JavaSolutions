package com.accenture.codes;

import java.util.Scanner;

public class NumberToAlphabets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        numberToAlphabets(N);
    }

    static void numberToAlphabets(int N) {
        String str = String.valueOf(N);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                result.append((char) (str.charAt(i) + 48));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                result.append('0');
            }
        }
        System.out.println(result);
    }
}
