package com.accenture.codes;

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        hollowSquare(n);
    }
    public static void hollowSquare(int num) {
        char ch = '@';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print(ch+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
