package com.accenture.codes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitTheList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        splitTheList(input);
    }

    public static void splitTheList(Scanner input) {
        String str = input.nextLine();
        int index = input.nextInt();
        input.nextLine();
        List<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            list.add(st.nextToken().trim());
        }
        if (index > list.size()) {
            System.out.println("Index out of bounds");
            return;
        }
        List<String> finalList = new ArrayList<>(list.subList(3, list.size()));
        finalList.addAll(list.subList(0, index));
        System.out.println(finalList);
    }
}