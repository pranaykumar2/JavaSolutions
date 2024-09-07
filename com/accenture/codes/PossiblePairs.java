package com.accenture.codes;

import java.util.*;

public class PossiblePairs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        possiblePairs(input);
    }

    public static void possiblePairs(Scanner input) {
        List<Integer> list = new ArrayList<>();
        String numbers = input.nextLine();
        int target = input.nextInt();
        StringTokenizer st = new StringTokenizer(numbers, ",");
        while (st.hasMoreTokens()) {
             list.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println(list);
        System.out.println("Pairs to which sum is : " + target);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(list.get(i) + " " + list.get(j));
                }
            }
        }
    }
}

