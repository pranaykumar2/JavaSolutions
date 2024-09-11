package com.accenture.codes;

import java.util.Scanner;

public class HarshaAndDigit {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        harshaAndDigit(str);
    }
    public static void harshaAndDigit(String str) {
        int num = Character.getNumericValue(str.charAt(0)) % Character.getNumericValue(str.charAt(str.length() - 1));
        System.out.println(num);
    }
}
