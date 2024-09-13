package com.darwinbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AntiSpiral {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        antiSpiral(arr);
    }
    public static void antiSpiral(int[][] arr) {
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;
        List<Integer> result = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                result.add(arr[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }
        Collections.reverse(result);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
