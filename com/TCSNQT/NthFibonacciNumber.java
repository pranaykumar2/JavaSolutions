package com.TCSNQT;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static int nthFibonacciNumber(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int step = 2; step <= num; step++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int fib = nthFibonacciNumber(n);
        System.out.print(fib);
    }
}