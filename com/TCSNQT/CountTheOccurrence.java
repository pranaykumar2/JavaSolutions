package com.TCSNQT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheOccurrence {
    public static void countOccurrence(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> print : map.entrySet()) {
            System.out.println(print.getKey() + " = " + print.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        countOccurrence(str);
        input.close();
    }
}