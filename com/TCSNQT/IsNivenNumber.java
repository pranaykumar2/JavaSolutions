package com.TCSNQT;

import java.util.Scanner;

public class IsNivenNumber {
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    public static boolean isNivenNumber(int num) {
        int digitSum = sumOfDigits(num);
        return num % digitSum == 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean check = isNivenNumber(number);
        if (check) {
            System.out.println("Niven Number");
        } else {
            System.out.println("Not a Niven Number");
        }
    }
}
