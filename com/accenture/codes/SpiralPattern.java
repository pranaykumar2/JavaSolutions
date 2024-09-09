package com.accenture.codes;

import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        int dimension = new Scanner(System.in).nextInt();
        spiralPattern(dimension);
    }
    public static void spiralPattern(int dimension) {
        int[][] matrix = new int[dimension][dimension];
        int num = 1;
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension - i; j++) {
                matrix[i][j] = num++;
            }
            for (int j = i + 1; j < dimension - i; j++) {
                matrix[j][dimension - i - 1] = num++;
            }
            for (int j = dimension - i - 2; j >= i; j--) {
                matrix[dimension - i - 1][j] = num++;
            }
            for (int j = dimension - i - 2; j > i; j--) {
                matrix[j][i] = num++;
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}