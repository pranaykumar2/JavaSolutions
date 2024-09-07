package com.accenture.codes;

import java.util.Scanner;

public class ColorInversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = input.nextInt();
        }
        colorInversion(arr);
    }
    static void colorInversion(int[] arr) {
        for(int i : arr) {
            System.out.print(255 - i + " ");
        }
    }
}
