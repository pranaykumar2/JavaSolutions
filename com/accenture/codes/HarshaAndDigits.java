package com.accenture.codes;

import java.util.Scanner;

public class HarshaAndDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        harshaAndDigits(number);
    }
    public static void harshaAndDigits(String num) {
        int firstDigit = Character.getNumericValue(num.charAt(0));
        int lastDigit = Character.getNumericValue(num.charAt(num.length()-1));
        System.out.print(firstDigit % lastDigit);
    }
}
