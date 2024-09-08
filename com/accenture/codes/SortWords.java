package com.accenture.codes;

import java.util.Scanner;

public class SortWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char ch = input.next().charAt(0);
        sortWords(str, ch);
    }
    public static void sortWords(String str, char ch) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].charAt(0) == ch) {
                System.out.println(words[i] + " " + (i+1));
            }
        }
    }
}
