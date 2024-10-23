package com.TCSNQT;

import java.util.Scanner;

public class IsAutomorphicNumber {
    public static boolean isAutomorphicNumber(int num) {
        int square = (int) Math.pow(num, 2) % 10;
        int rem = num % 10;
        return square == rem;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean check = isAutomorphicNumber(number);
        if (check) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not an Automorphic Number");
        }
    }
}
