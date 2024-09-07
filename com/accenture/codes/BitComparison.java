package com.accenture.codes;

import java.util.Scanner;

public class BitComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        bitComparison(str1, str2);
    }

    static void bitComparison (String a, String b) {
        int BitChange = 0, CountZeroesA = 0, CountZeroesB = 0;
        for(int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                BitChange += 1;
            }
            else if (a.charAt(i) == '0') {
                CountZeroesA += 1;
            }
            else if (b.charAt(i) == '0') {
                CountZeroesB += 1;
            }
        }
        System.out.println(BitChange + "\n" + (CountZeroesA == CountZeroesB ? "0" : "1"));
    }
}
