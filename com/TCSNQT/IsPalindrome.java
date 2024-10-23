package com.TCSNQT;

import java.util.Scanner;

public class IsPalindrome {
    static boolean isPalindrome(int num) {
        int temp = num, sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum * 10 + rem;
            num /= 10;
        }
        return temp == sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean check = isPalindrome(number);
        if (check) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
