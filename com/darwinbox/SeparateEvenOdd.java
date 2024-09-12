package com.darwinbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparateEvenOdd {

    public static void main(String[] args) {
        String numbers = new Scanner(System.in).nextLine();
        String[] numberArray = numbers.split(" ");
        separateEvenOdd(numberArray);
    }
    public static void separateEvenOdd(String[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (String num : nums) {
            int number = Integer.parseInt(num);
            if (number % 2 == 0) {
                even.add(number);
            }
            else {
                odd.add(number);
            }
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
