package com.accenture.codes;

import java.util.Scanner;

public class SquareAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        squareAndSum(arr);
    }

    static void squareAndSum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += (int) Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
