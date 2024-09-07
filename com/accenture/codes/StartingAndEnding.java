package com.accenture.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StartingAndEnding {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        startingAndEnding(input);
    }

    public static void startingAndEnding(Scanner input) {
        String str = input.nextLine();
        int target = input.nextInt();
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, ", ");
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int firstOccurrence = -1;
        int lastOccurrence = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("First Occurrence At: " + firstOccurrence);
            System.out.println("Last Occurrence At: " + lastOccurrence);
        } else {
            System.out.println("Element not found");
        }
    }
}