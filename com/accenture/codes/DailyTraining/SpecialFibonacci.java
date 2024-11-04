package com.accenture.codes.DailyTraining;

import java.util.Scanner;

public class SpecialFibonacci {

    public static int findSpecialFibonacci(int n) {
        if (n <= 1){
            return 1;
        }
        return (int) ((int) Math.pow(findSpecialFibonacci(n - 1), 2) + Math.pow(findSpecialFibonacci(n - 2), 2));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int fib = findSpecialFibonacci(n);
        System.out.println(fib % 47);
        input.close();

    }
}
