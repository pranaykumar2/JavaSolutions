package com.accenture.codes.DailyTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EvenOdd {

    public static void evenOdd(List<Integer> li) {
        for (Integer i : li) {
            if (i % 2 == 0) {
                System.out.print("Even ");
            } else {
                System.out.print("Odd ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        String num = input.nextLine();
        StringTokenizer st = new StringTokenizer(num, ", ");
        while(st.hasMoreTokens()) {
            li.add(Integer.parseInt(st.nextToken()));
        }
        evenOdd(li);
    }
}
