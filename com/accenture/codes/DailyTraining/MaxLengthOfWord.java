package com.accenture.codes.DailyTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxLengthOfWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        List<String> li = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, " ");
        String maxWord = "";
        while (st.hasMoreTokens()) {
            li.add(st.nextToken());
        }
        for (String s : li) {
            if (s.length() > maxWord.length()) {
                maxWord = s;
            }
        }
        System.out.println(maxWord);
    }
}
