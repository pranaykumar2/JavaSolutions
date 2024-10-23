package com.TCSNQT;

import java.util.Scanner;


public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (number != 0) {
            int rem = number % 10;
            sum += rem * rem * rem;
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
