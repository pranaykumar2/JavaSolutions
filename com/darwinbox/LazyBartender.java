package com.darwinbox;

import java.util.*;

public class LazyBartender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int N = scanner.nextInt(); // Number of cocktail types
        int C = scanner.nextInt(); // Number of customers

        List<Set<Integer>> sets = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sets.add(new HashSet<>());
        }

        for (int i = 0; i < C; i++) {
            int T = scanner.nextInt(); // Number of cocktail types this customer likes
            for (int j = 0; j < T; j++) {
                int cocktail = scanner.nextInt() - 1; // Subtract 1 to use 0-based indexing
                sets.get(cocktail).add(i);
            }
        }

        // Solve the problem using Set Cover algorithm
        Set<Integer> universe = new HashSet<>();
        for (int i = 0; i < C; i++) {
            universe.add(i);
        }

        List<Integer> setCover = setClover(sets, universe);

        // Output the result
        System.out.println(setCover.size());

        scanner.close();
    }

    private static List<Integer> setClover(List<Set<Integer>> sets, Set<Integer> universe) {
        List<Integer> cover = new ArrayList<>();
        Set<Integer> covered = new HashSet<>();

        while (covered.size() < universe.size()) {
            int maxNewCoverage = 0;
            int bestSet = -1;

            for (int i = 0; i < sets.size(); i++) {
                Set<Integer> newElements = new HashSet<>(sets.get(i));
                newElements.removeAll(covered);
                if (newElements.size() > maxNewCoverage) {
                    maxNewCoverage = newElements.size();
                    bestSet = i;
                }
            }

            if (bestSet == -1) break; // This shouldn't happen if the input is valid

            cover.add(bestSet);
            covered.addAll(sets.get(bestSet));
        }

        return cover;
    }
}