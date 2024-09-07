package com.accenture.codes;

import java.util.Scanner;

public class ExcludeGoldenPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        int TotalPrice = excludeGoldenPrice(X, Y);
        System.out.println(TotalPrice);
    }

    static int excludeGoldenPrice(int X, int Y) {
        int sum = 0;
        for (int i = X; i <= Y; i++) {
            if(!isGoldenPrice(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isGoldenPrice(int cost) {
        int sum = 0, max = 0;
        while(cost > 0) {
            int digit = cost % 10;
            max = Math.max(max, digit);
            sum += digit;
            cost /= 10;
        }
        int check = sum - max;
        return check == max;
    }
}