package com.TCSNQT;

import java.util.Scanner;


public class IsArmstrongNumber {
    public static int findLength(int number) {
        int length = 0;
        while (number != 0) {
            length++;
            number /= 10;
        }
        return length;
    }

    public static boolean isArmstrongNumber(int number) {
        int temp = number;
        int sum = 0, length = findLength(number);
        while (number != 0) {
            int rem = number % 10;
            sum += (int) Math.pow(rem, length);
            number /= 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean check = isArmstrongNumber(number);
        if (check) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
