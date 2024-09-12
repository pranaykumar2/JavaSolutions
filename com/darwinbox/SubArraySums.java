package com.darwinbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubArraySums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(",");

        int[] A = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            A[i] = Integer.parseInt(inputArray[i].trim());
        }

        List<Integer> B = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                B.add(sum);
            }
        }

        Collections.sort(B);

        int queries = scanner.nextInt();
        scanner.nextLine();

        for (int q = 0; q < queries; q++) {
            String[] query = scanner.nextLine().split(",");
            int start = Integer.parseInt(query[0].trim());
            int end = Integer.parseInt(query[1].trim());

            int rangeSum = 0;
            for (int k = start - 1; k < end; k++) {
                rangeSum += B.get(k);
            }
            System.out.println(rangeSum);
        }
    }
}