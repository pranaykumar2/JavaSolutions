package com.Hackerrank;

import java.util.Scanner;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] tokens = str.split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i].trim());
        }
        maximumProductSubArray(arr);
    }

    public static void maximumProductSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                max = Math.max(max, product);
            }
        }
        System.out.print(max);
    }
}