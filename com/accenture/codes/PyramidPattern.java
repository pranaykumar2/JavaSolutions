package com.accenture.codes;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        pyramidPattern(n);
    }
    public static void pyramidPattern(int num) {
        char ch = '#';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
