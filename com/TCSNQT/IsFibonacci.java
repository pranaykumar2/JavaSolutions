package com.TCSNQT;

import java.util.Scanner;

public class IsFibonacci {
    static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == num;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean check = isFibonacci(number);
        if (check) {
            System.out.println("Fibonacci Number");
        } else {
            System.out.println("Not a Fibonacci Number");
        }
    }
}
