package com.accenture.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateElementTupleInaList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("A001", "A004", "A001"));
        list.add(Arrays.asList("A004", "A004", "A002"));
        list.add(Arrays.asList("A005", "A004", "A005"));

        String applicantId = input.nextLine();

        int n = input.nextInt();

        List<List<String>> result = findTuplesWithRepeatedId(list, applicantId, n);

        for (List<String> tuple : result) {
            System.out.println(tuple);
        }
    }

    public static List<List<String>> findTuplesWithRepeatedId(List<List<String>> list, String applicantId, int n) {
        List<List<String>> result = new ArrayList<>();
        for (List<String> tuple : list) {
            long count = tuple.stream().filter(id -> id.equals(applicantId)).count();
            if (count == n) {
                result.add(tuple);
            }
        }
        return result;
    }
}