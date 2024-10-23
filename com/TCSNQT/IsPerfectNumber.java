package com.TCSNQT;

import java.util.Scanner;

public class IsPerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean check = isPerfectNumber(number);
        if (check) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
    }
}