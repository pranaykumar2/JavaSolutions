package com.accenture.codes;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int index = input.nextInt();
        int k = kthSmallestElement(arr, index);
        System.out.println(k);
    }

    public static int kthSmallestElement(int[] arr, int index) {
        Arrays.sort(arr);
        return arr[index - 1];
    }
}
