package com.TCSNQT;

import java.util.Scanner;

public class IsStrongNumber {

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    static boolean isStrongNumber(int num) {
        int temp = num, sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += factorial(rem);
            num /= 10;
        }
        return temp == sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean check = isStrongNumber(number);
        if (check) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }
}
