package com.TCSNQT;

import java.util.Scanner;

public class HasNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.matches(".*\\d.*")) {
            System.out.println("YES it contains a number");
        }
        else {
            System.out.println("NO it doesn't contains a number");
        }
    }
}
