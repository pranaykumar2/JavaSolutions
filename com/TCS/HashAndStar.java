package com.TCS;

import java.util.Scanner;

public class HashAndStar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        countHashAndStar(str);
    }

    public static void countHashAndStar(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '#') {
                count--;
            }
            else {
                count++;
            }
        }
        System.out.println(count);
    }
}
