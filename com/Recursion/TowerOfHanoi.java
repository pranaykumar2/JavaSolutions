package com.Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    private static final Scanner scanner = new Scanner(System.in);
    private static int moves = 0;

    public static void main(String[] args) {
        System.out.println("Enter the number of disks: ");
        int numDisks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\"Enter the source peg (A, B, or C): ");
        char sourcePeg = scanner.next().charAt(0);
        System.out.println("\"Enter the destination peg (A, B, or C): ");
        char targetPeg = scanner.next().charAt(0);
        System.out.println("\"Enter the auxiliary peg (A, B, or C): ");
        char auxiliaryPeg = scanner.next().charAt(0);

        towerOfHanoi(numDisks, sourcePeg, targetPeg, auxiliaryPeg);
        System.out.println("Total number of moves: " + moves);
    }

    public static void towerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + fromPeg + " to peg " + toPeg);
            moves++;
            return;
        }

        towerOfHanoi(n - 1, fromPeg, auxPeg, toPeg);
        System.out.println("Move disk " + n + " from peg " + fromPeg + " to peg " + toPeg);
        moves++;
        towerOfHanoi(n - 1, auxPeg, toPeg, fromPeg);

    }
}