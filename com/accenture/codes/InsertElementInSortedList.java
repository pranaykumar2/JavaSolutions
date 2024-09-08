package com.accenture.codes;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInSortedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int[] arr = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
        int InsertNumber = input.nextInt();
        insertElementInSortedList(arr, InsertNumber);
    }
    public static void insertElementInSortedList(int[] arr, int num) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                result[i] = num;
                result[i+1] = arr[i];
            }
            else {
                result[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
