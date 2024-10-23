package com.TCSNQT;

import java.util.Scanner;

public class SubstringOrNot {
    static void isSubstring(String str, String subStr) {
        if (str.contains(subStr)) {
            System.out.println("Substring");
        } else {
            System.out.println("Not a Substring");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String subStr = input.nextLine();
        isSubstring(str, subStr);
    }
}
